package com.mariana.docker.dockerspringboot.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloClass {

    @GetMapping
    public String hello()
    {
        return "Hello!";
    }
}
