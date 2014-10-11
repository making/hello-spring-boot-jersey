package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class App {

    @ComponentScan
    static class JerseryConfig extends ResourceConfig {
        public JerseryConfig() {
            packages(true, "com.example");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}