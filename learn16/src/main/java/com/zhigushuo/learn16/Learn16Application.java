package com.zhigushuo.learn16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Learn16Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn16Application.class, args);
    }


    @Bean
    public CacheKeyGenerator cacheKeyGenerator() {
        return new LockKeyGenerator();
    }
}
