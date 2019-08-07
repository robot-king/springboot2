package com.lx.feignclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SuController {


    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/consusmer",method = RequestMethod.GET)
    public Map consumerservice(){
        return  consumerService.consumoerMark();
    }



}
