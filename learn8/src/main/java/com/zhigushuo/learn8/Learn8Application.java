package com.zhigushuo.learn8;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhigushuo.learn8.dao")
public class Learn8Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn8Application.class, args);
    }

}
