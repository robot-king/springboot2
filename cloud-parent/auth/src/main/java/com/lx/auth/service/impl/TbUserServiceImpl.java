package com.lx.auth.service.impl;

import com.lx.auth.entity.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lx.auth.dao.TbUserMapper;
import com.lx.auth.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;


    @Override
    public TbUser getByUserName(String userName) {

        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",userName);
        return tbUserMapper.selectOneByExample(example);
    }
}
