package com.syan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.syan.*"})
public class SpringbootMyRecipeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyRecipeApplication.class, args);
    }
}
