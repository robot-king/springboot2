package com.zhigushuo.learn6;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Learn6ApplicationTests {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void contextLoads() {
        final Teacher teacher = teacherRepository.save(new Teacher("u1", "p1"));
        log.info("[添加成功] - [{}]", teacher);
        final List<Teacher> u1 = teacherRepository.findAllByUsername("u1");
        log.info("[条件查询] - [{}]", u1);
        Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Order.desc("username")));
        final Page<Teacher> teachers = teacherRepository.findAll(pageable);
        log.info("[分页+排序+查询所有] - [{}]", teachers.getContent());
        teacherRepository.findById(teachers.getContent().get(0).getId()).ifPresent(teacher1 -> log.info("[主键查询] - [{}]", teacher1));
        final Teacher edit = teacherRepository.save(new Teacher(teacher.getId(), "修改后的ui", "修改后的p1"));
        log.info("[修改成功] - [{}]", edit);
        teacherRepository.deleteById(teacher.getId());
        log.info("[删除主键为 {} 成功] - [{}]", teacher.getId());
    }

}
