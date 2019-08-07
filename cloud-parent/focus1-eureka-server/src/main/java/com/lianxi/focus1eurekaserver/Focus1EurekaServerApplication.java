package com.lianxi.focus1eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Focus1EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Focus1EurekaServerApplication.class, args);
    }

}
