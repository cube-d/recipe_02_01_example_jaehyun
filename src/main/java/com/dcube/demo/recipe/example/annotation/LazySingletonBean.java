package com.dcube.demo.recipe.example.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Lazy
@Component
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Dcube
public @interface LazySingletonBean {
}
