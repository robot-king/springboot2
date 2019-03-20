package com.zhigushuo.learn7.controller;

import com.zhigushuo.learn7.entity.TTeacher;
import com.zhigushuo.learn7.service.TTeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TTeacher)表控制层
 *
 * @author makejava
 * @since 2019-03-20 11:38:05
 */
@RestController
@RequestMapping("tTeacher")
public class TTeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TTeacherService tTeacherService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTeacher selectOne(Integer id) {
        return this.tTeacherService.queryById(id);
    }

}