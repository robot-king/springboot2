package com.lx.auth.service;

import com.lx.auth.entity.TbPermission;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectByUserId(Long userId);
}
