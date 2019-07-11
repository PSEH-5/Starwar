package com.starwars.configurators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.starwars")
public class ServiceConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigurator.class, args);
    }
}
