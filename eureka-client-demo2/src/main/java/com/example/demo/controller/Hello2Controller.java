package com.example.demo.controller;

import com.example.demo.service.Hello2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
    @Autowired
    Hello2Service service;
    @GetMapping("/hello2")
    public String sayHello2(){
        return service.sayHello2();
    }
    @GetMapping("/hello3")
    public String sayHello3(){
        return service.sayHello3();
    }
}
