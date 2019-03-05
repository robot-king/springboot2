package com.zhigushuo.learn3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
 
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
 
    private String username;
 
    private Integer age;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username= username;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
