package com.lx.auth.service.impl;

import com.lx.auth.entity.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lx.auth.dao.TbPermissionMapper;
import com.lx.auth.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
