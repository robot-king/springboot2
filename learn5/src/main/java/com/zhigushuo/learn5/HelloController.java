package com.zhigushuo.learn5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class HelloController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public HelloController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @GetMapping("queryListStudents")
    public List<Student> queryListStudents(){
        // 查询所有学生
        String sql = "select * from student";
        return  jdbcTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<>(Student.class));
    }



}
