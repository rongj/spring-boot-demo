package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
  @RequestMapping("/login")
  public String login() {
    return "login page";
  }
  
  @RequestMapping("/register")
  public String register() {
    return "register page";
  }
  
  @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
  public String getuser(@PathVariable("name") String name) {
    return "user " + name;
  }
}