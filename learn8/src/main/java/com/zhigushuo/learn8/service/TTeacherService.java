package com.zhigushuo.learn8.service;

import com.zhigushuo.learn8.entity.TTeacher;
import java.util.List;

/**
 * (TTeacher)表服务接口
 *
 * @author makejava
 * @since 2019-03-20 11:38:05
 */
public interface TTeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTeacher queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTeacher> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTeacher 实例对象
     * @return 实例对象
     */
    TTeacher insert(TTeacher tTeacher);

    /**
     * 修改数据
     *
     * @param tTeacher 实例对象
     * @return 实例对象
     */
    TTeacher update(TTeacher tTeacher);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    // 全查
    List<TTeacher> queryList(TTeacher tTeacher);
    // 分页查询
    List<TTeacher> queryList(TTeacher tTeacher,Integer pgNum,Integer pgSize);

}