package com.zhigushuo.learn10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Learn10Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn10Application.class, args);
    }

}
