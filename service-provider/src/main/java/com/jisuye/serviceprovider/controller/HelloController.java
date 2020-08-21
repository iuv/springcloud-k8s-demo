package com.jisuye.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
