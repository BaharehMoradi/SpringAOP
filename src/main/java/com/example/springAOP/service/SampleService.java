package com.example.springAOP.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String accountMethod1() {
        return "method1 from SampleService class invoked!";
    }

    public String accountMethod2() {
        return "method2 from SampleService class invoked!";
    }

}
