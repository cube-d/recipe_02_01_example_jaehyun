package com.dcube.demo.recipe.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
public class ResourceConfig {

    @Bean
    public Resource testFile() {
        return new ClassPathResource("data/test.zip");
    }
}
