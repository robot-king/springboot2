package com.zhigushuo.learn3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
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

        log.info("hello world:" + user.getUsername());
        log.warn("waring waring waring waring ");
        log.error("(⊙o⊙)…");

        return "hello world:" + user.getUsername();
    }
}
