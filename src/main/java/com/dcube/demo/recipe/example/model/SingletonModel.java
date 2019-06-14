package com.dcube.demo.recipe.example.model;


import com.dcube.demo.recipe.example.annotation.SingletonBean;
import org.springframework.core.io.Resource;

import java.io.IOException;

@SingletonBean
public class SingletonModel extends AbstractModel{
    public SingletonModel(Resource testFile) throws IOException {
        super(testFile);
    }

}
