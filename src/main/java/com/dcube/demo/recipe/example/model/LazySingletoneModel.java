package com.dcube.demo.recipe.example.model;

import com.dcube.demo.recipe.example.annotation.LazySingletonBean;
import org.springframework.core.io.Resource;

import java.io.IOException;

@LazySingletonBean
public class LazySingletoneModel extends AbstractModel {

    public LazySingletoneModel(Resource testFile) throws IOException {
        super(testFile);
    }
}
