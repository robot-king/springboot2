package com.zhigushuo.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value(value = "${spring.application.name}")
    private String projectName;


    @RequestMapping("world")
    public String world() {
        return "hello world:" + projectName;
    }


    @Autowired
    private UserProperties user;

    @RequestMapping("user")
    public String user() {
        return "hello world:" + user.getUsername();
    }
}
