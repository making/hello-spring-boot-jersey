package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("hello")
public class Hello {
    @Value("${hello.name:World}")
    String name;

    @GET
    public String hello() {
        return "Hello " + name + "!";
    }

}
