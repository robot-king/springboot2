package com.lx.auth.dao;

import com.lx.auth.entity.TbPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TbPermissionMapper extends tk.mybatis.mapper.common.Mapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);


}