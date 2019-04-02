package com.zhigushuo.learn9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learn9ApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @Test
    public void contextLoads() {

        // 测试线程安全
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).forEach(i ->
                executorService.execute(() -> stringRedisTemplate.opsForValue().increment("AA", 1))
        );

        // 设置value为字符串
        stringRedisTemplate.opsForValue().set("who", "hello，I am bitch");
        final String k1 = stringRedisTemplate.opsForValue().get("who");
        System.out.println("[字符缓存结果] - [{" + k1 + "}]");
        String key = "student";
        redisCacheTemplate.opsForValue().set(key, new Student(1L, "zhangsan", "111"));
        final Student user = (Student) redisCacheTemplate.opsForValue().get(key);
        System.out.println("[对象缓存结果] - [{" + user + "}]");
    }

}
