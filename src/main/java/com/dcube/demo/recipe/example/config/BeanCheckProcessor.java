package com.dcube.demo.recipe.example.config;

import com.dcube.demo.recipe.example.model.AbstractModel;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanCheckProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof AbstractModel){
            AbstractModel model = (AbstractModel)bean;
            System.out.println("Make Bean! Bean name is" + model.getBeanName());
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
