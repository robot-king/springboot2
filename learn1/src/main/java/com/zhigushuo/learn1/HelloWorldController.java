package com.zhigushuo.learn1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("world")
    public String world(){
        return "hello world";
    }
}
