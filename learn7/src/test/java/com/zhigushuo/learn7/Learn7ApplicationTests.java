package com.zhigushuo.learn7;

import com.zhigushuo.learn7.entity.TTeacher;
import com.zhigushuo.learn7.service.TTeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learn7ApplicationTests {

    @Autowired
    private TTeacherService tTeacherService;

    @Test
    public void contextLoads() {
        TTeacher tTeacher = new TTeacher();
        tTeacher.setUsername("张三");
        tTeacher.setPassword("mima");
        tTeacher.setEmail("email");
        tTeacherService.insert(tTeacher);

        List<TTeacher> list = tTeacherService.queryList(null);
        if (!CollectionUtils.isEmpty(list)){
            for (TTeacher tt:list){
                System.out.println(tt.getUsername());
                System.out.println(tt.getPassword());
                System.out.println(tt.getEmail());
            }
        }
    }

}
