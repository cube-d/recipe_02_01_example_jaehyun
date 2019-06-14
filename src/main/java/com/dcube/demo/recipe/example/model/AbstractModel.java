package com.dcube.demo.recipe.example.model;

import lombok.Getter;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

@Getter
public abstract class AbstractModel {

    protected final Resource testFile;
    protected final List<byte[]> bytes;
    protected final String BeanName;

    public AbstractModel(Resource testFile) throws IOException {
        this.testFile = testFile;
        BeanName = this.getClass().toString();
        bytes = Collections.singletonList(Files.readAllBytes(this.testFile.getFile().toPath()));
    }
}
