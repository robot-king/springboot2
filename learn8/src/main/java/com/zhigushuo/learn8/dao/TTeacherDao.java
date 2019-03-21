package com.zhigushuo.learn8.dao;

import com.zhigushuo.learn8.entity.TTeacher;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TTeacher)表数据库访问层
 *
 * @author makejava
 * @since 2019-03-20 11:38:05
 */
public interface TTeacherDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTeacher queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTeacher> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTeacher 实例对象
     * @return 对象列表
     */
    List<TTeacher> queryAll(TTeacher tTeacher);

    /**
     * 新增数据
     *
     * @param tTeacher 实例对象
     * @return 影响行数
     */
    int insertSelective(TTeacher tTeacher);

    /**
     * 修改数据
     *
     * @param tTeacher 实例对象
     * @return 影响行数
     */
    int update(TTeacher tTeacher);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}