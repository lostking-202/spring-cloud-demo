package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hello1")
public interface UserClient {

  @GetMapping("/user/get/{userId}")
  String getUser(@PathVariable("userId") String userId);
}