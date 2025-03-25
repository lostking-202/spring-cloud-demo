package com.example.demo.controller;

import com.example.demo.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserClient userClient;

  @GetMapping("/info/{userId}")
  public String getUserInfo(@PathVariable("userId") String userId) {
    return userClient.getUser(userId);
  }
}