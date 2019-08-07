package com.lx.auth.service.impl;

import com.lx.auth.entity.TbContent;
import com.lx.auth.service.TbContentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lx.auth.dao.TbContentMapper;

import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
