package com.jisuye.servicecustomer.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "fallback....";
    }
}
