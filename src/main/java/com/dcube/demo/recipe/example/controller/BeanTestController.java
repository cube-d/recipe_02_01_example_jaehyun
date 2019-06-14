package com.dcube.demo.recipe.example.controller;


import com.dcube.demo.recipe.example.annotation.*;
import com.dcube.demo.recipe.example.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;


@RestController
public class BeanTestController {

    private static final Logger logger = LoggerFactory.getLogger(BeanTestController.class);

    @Autowired
    ApplicationContext context;


    @GetMapping("/singletone")
    public String makeSingletoneBean() {

        printModelHashCodeList(makeModelList(SingletonBean.class, "singletonModel"));
        return "singletone!";
    }

    @GetMapping("/lazysingletone")
    public String makeLazySingletoneBean() {

        printModelHashCodeList(makeModelList(LazySingletonBean.class, "lazySingletoneModel"));
        return "lazysingletone!";
    }

    @GetMapping("/protype")
    public String makePrototypeBean() {

        printModelHashCodeList(makeModelList(PrototypeBean.class, "prototypeModel"));
        return "prototypeModel!";
    }

    @GetMapping("/lazyprotype")
    public String makeLazyPrototypeBean() {

        printModelHashCodeList(makeModelList(LazyPrototypeBean.class, "lazyPrototypeModel"));
        return "lazyprotype!";
    }


    private List makeModelList(Class<? extends Annotation> annotationType, String key){

        List modelList = new ArrayList();

        for(int i=0 ;i <5; i++){
            final AbstractModel model = (AbstractModel) context.getBeansWithAnnotation(annotationType).get(key);
            modelList.add(model);
        }

        return modelList;

    }

    private void printModelHashCodeList(List modelList){
        modelList.stream().forEach(m -> logger.info("Model hashCode is {}", String.valueOf(m.hashCode())));
    }

}
