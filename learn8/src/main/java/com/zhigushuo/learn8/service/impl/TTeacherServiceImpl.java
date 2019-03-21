package com.zhigushuo.learn8.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhigushuo.learn8.entity.TTeacher;
import com.zhigushuo.learn8.dao.TTeacherDao;
import com.zhigushuo.learn8.service.TTeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTeacher)表服务实现类
 *
 * @author makejava
 * @since 2019-03-20 11:38:05
 */
@Service("tTeacherService")
public class TTeacherServiceImpl implements TTeacherService {
    @Resource
    private TTeacherDao tTeacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTeacher queryById(Integer id) {
        return this.tTeacherDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TTeacher> queryAllByLimit(int offset, int limit) {
        return this.tTeacherDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTeacher 实例对象
     * @return 实例对象
     */
    @Override
    public TTeacher insert(TTeacher tTeacher) {
        this.tTeacherDao.insertSelective(tTeacher);
        return tTeacher;
    }

    /**
     * 修改数据
     *
     * @param tTeacher 实例对象
     * @return 实例对象
     */
    @Override
    public TTeacher update(TTeacher tTeacher) {
        this.tTeacherDao.update(tTeacher);
        return this.queryById(tTeacher.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTeacherDao.deleteById(id) > 0;
    }

    @Override
    public List<TTeacher> queryList(TTeacher tTeacher) {
        return tTeacherDao.queryAll(tTeacher);
    }

    @Override
    public List<TTeacher> queryList(TTeacher tTeacher, Integer pgNum, Integer pgSize) {
        PageHelper.startPage(pgNum,pgSize);
        return tTeacherDao.queryAll(tTeacher);
    }
}