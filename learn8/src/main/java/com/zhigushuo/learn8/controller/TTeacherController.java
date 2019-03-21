package com.zhigushuo.learn8.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zhigushuo.learn8.entity.TTeacher;
import com.zhigushuo.learn8.service.TTeacherService;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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


    /**
     *
     */
    @GetMapping("queryListByPage")
    public String queryListByPage(Integer pgNum, Integer pgSize) {
        List<TTeacher> list = tTeacherService.queryList(null, pgNum, pgSize);
        String str = "";
        if (!CollectionUtils.isEmpty(list)) {
            str = JSON.toJSONString(list);
        }
        return str;
    }

}