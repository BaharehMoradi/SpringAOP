package com.example.springAOP.controller;

import com.example.springAOP.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @Autowired
    public SampleService sampleService;

    @GetMapping("/controller-method1")
    public String firstMethod() {
        System.out.println("Account service response: "+ sampleService.accountMethod1());
        return "Hello World! from method1!";
    }

    @GetMapping("/controller-method2")
    public String secondMethod() {
        System.out.println("Account service response: "+ sampleService.accountMethod2());
        return "Hello World! from method2!";
    }
}
