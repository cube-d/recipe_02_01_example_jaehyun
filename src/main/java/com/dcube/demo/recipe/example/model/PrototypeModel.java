package com.dcube.demo.recipe.example.model;

import com.dcube.demo.recipe.example.annotation.PrototypeBean;
import org.springframework.core.io.Resource;

import java.io.IOException;

@PrototypeBean
public class PrototypeModel extends AbstractModel {

    public PrototypeModel(Resource testFile) throws IOException {
        super(testFile);
    }
}
