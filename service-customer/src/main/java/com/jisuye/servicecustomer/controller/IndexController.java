package com.jisuye.servicecustomer.controller;

import com.jisuye.servicecustomer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/index")
    public String index(){
        return helloService.hello();
    }
}
