package com.lx.auth.dao;

import com.lx.auth.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUserMapper extends tk.mybatis.mapper.common.Mapper<TbUser> {

    TbUser getByUserName(@Param("username") String username);


}