package com.zhigushuo.learn8.entity;

import java.io.Serializable;

/**
 * (TTeacher)实体类
 *
 * @author makejava
 * @since 2019-03-20 11:38:05
 */
public class TTeacher implements Serializable {
    private static final long serialVersionUID = 286516255853861954L;
    
    private Integer id;
    
    private String password;
    
    private String username;
    
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}