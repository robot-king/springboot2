package com.zhigushuo.learn10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 */
@Service
public class StudentServiceImpl implements StudentService {

    private static final Map<Long, Student> DATA_BASE = new HashMap<>();

    private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Cacheable(value = "user", key = "#id")
    @Override
    public Student get(Long id) {
        // TODO 我们就假设它是从数据库读取出来的
        log.info("进入 get 方法");
        return DATA_BASE.get(id);
    }

    @CachePut(value = "user", key = "#user.id")
    @Override
    public Student saveOrUpdate(Student user) {
        DATA_BASE.put(user.getId(), user);
        log.info("进入 saveOrUpdate 方法");
        return user;
    }

    @CacheEvict(value = "user", key = "#id")
    @Override
    public void delete(Long id) {
        DATA_BASE.remove(id);
        log.info("进入 delete 方法");
    }
}