package com.zhigushuo.learn10;


/**
 */
public interface StudentService {

    /**
     * 删除
     *
     * @param student 用户对象
     * @return 操作结果
     */
    Student saveOrUpdate(Student student);

    /**
     * 添加
     *
     * @param id key值
     * @return 返回结果
     */
    Student get(Long id);

    /**
     * 删除
     *
     * @param id key值
     */
    void delete(Long id);
}