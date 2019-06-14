package com.dcube.demo.recipe.example.controller;


import com.dcube.demo.recipe.example.annotation.LazyPrototypeBean;
import com.dcube.demo.recipe.example.annotation.LazySingletonBean;
import com.dcube.demo.recipe.example.annotation.PrototypeBean;
import com.dcube.demo.recipe.example.annotation.SingletonBean;
import com.dcube.demo.recipe.example.model.LazyPrototypeModel;
import com.dcube.demo.recipe.example.model.LazySingletoneModel;
import com.dcube.demo.recipe.example.model.PrototypeModel;
import com.dcube.demo.recipe.example.model.SingletonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class BeanTestController {


    @Autowired
    ApplicationContext context;


    @GetMapping("/singletone")
    public String makeSingletoneBean() throws IOException {

        List modelList= new ArrayList();
        for(int i=0 ;i <5; i++){

            final SingletonModel model = (SingletonModel) context.getBeansWithAnnotation(SingletonBean.class).get("singletonModel");
            modelList.add(model);
            System.out.println(model.toString());
        }
        return "singletone!";
    }

    @GetMapping("/lazysingletone")
    public String makeLazySingletoneBean() throws IOException {

        List modelList= new ArrayList();
        for(int i=0 ;i <5; i++){
            final LazySingletoneModel model = (LazySingletoneModel) context.getBeansWithAnnotation(LazySingletonBean.class).get("lazySingletoneModel");
            modelList.add(model);
            System.out.println(model.toString());
        }
        return "lazysingletone!";
    }

    @GetMapping("/protype")
    public String makePrototypeBean() throws IOException {

        List modelList= new ArrayList();
        for(int i=0 ;i <5; i++){

            final PrototypeModel model = (PrototypeModel) context.getBeansWithAnnotation(PrototypeBean.class).get("prototypeModel");
            modelList.add(model);
            System.out.println(model.toString());
        }

        return "prototypeModel!";
    }

    @GetMapping("/lazyprotype")
    public String makeLazyPrototypeBean() throws IOException {

        List modelList= new ArrayList();
        for(int i=0 ;i <5; i++){

            final LazyPrototypeModel model = (LazyPrototypeModel) context.getBeansWithAnnotation(LazyPrototypeBean.class).get("lazyPrototypeModel");
            modelList.add(model);
            System.out.println(model.toString());
        }

        return "lazyprotype!";
    }

}
