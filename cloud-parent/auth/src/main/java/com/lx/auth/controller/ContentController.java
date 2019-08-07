package com.lx.auth.controller;


import com.lx.auth.dto.ResponseResultDto;
import com.lx.auth.entity.TbContent;
import com.lx.auth.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {


    @Autowired
    TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResultDto<List<TbContent>> selectAll() {
        List<TbContent> list = tbContentService.selectAll();
        return new ResponseResultDto<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.getReasonPhrase(),list);
    }


}
