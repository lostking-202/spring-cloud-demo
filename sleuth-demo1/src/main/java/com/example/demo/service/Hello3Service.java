package com.example.demo.service;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Hello3Service {

    //@HystrixCommand(fallbackMethod="fallBack")
    @Autowired
    RestTemplate restTemplate;

    public String sayHello3(){
        return restTemplate.getForObject("http://localhost:8081/hello1", String.class);
    }
    public String fallBack(){
        return "failure";
    }
}
