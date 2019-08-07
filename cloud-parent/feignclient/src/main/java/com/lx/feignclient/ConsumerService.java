package com.lx.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "RIBBONSERVICE",fallback = ConsumerHystrix.class)
public interface ConsumerService {


    @RequestMapping(value = "mark",method = RequestMethod.GET)
    Map consumoerMark();
}
