package com.zhigushuo.learn8;

import com.zhigushuo.learn8.entity.TTeacher;
import com.zhigushuo.learn8.service.TTeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learn8ApplicationTests {

    @Autowired
    private TTeacherService tTeacherService;

    @Test
    public void contextLoads() {
//        TTeacher tTeacher = new TTeacher();
//        tTeacher.setUsername("张三");
//        tTeacher.setPassword("mima");
//        tTeacher.setEmail("email");
//        tTeacherService.insert(tTeacher);
//
//        List<TTeacher> list = tTeacherService.queryList(null);
//        if (!CollectionUtils.isEmpty(list)){
//            for (TTeacher tt:list){
//                System.out.println(tt.getUsername());
//                System.out.println(tt.getPassword());
//                System.out.println(tt.getEmail());
//            }
//        }
//        new HashMap<>();

//        int i = 0;
//        int b = 0;
//        do {
//            i = 10;
//        } while ((b = i) != 0);
//        System.out.println("hh:" + b);

        Map map = new HashMap();
        map.put("username","张三");
        Object username = map.get("username");
        System.out.println("dd:" + username);
    }

}
