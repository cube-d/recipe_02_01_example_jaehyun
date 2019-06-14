package com.dcube.demo.recipe.example.model;


import com.dcube.demo.recipe.example.annotation.LazyPrototypeBean;
import org.springframework.core.io.Resource;

import java.io.IOException;

@LazyPrototypeBean
public class LazyPrototypeModel extends AbstractModel {

    public LazyPrototypeModel(Resource testImageResource) throws IOException {
        super(testImageResource);
    }
}
