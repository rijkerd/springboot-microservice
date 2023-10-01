package com.rushatsi.microservice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello! No Dockerfile";
    }
}
