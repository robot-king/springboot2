package com.zhigushuo.learn10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learn10ApplicationTests {
    @Autowired
    private StudentService studentService;

    @Test
    public void contextLoads() {

        final Student student = studentService.saveOrUpdate(new Student(4L, "dama", "44"));
        System.out.println("[saveOrUpdate] - [{" + student + "}]");
        final Student student1 = studentService.get(4L);
        System.out.println("[get] - [{"+student1+"}]");
        final Student student2 = studentService.get(4L);
        System.out.println("[get] - [{"+student2+"}]");
        studentService.delete(4L);

    }

}
