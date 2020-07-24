package com.example.demo.controller;

import com.example.demo.service.Hello3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {
    @Autowired
    Hello3Service service;
    @RequestMapping("/hello3")
    public String sayHello3(){
        return service.sayHello3();
    }
}
