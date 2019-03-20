package com.zhigushuo.learn7;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhigushuo.learn7.dao")
public class Learn7Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn7Application.class, args);
    }

}
