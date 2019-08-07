package com.lx.feignclient;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsumerHystrix implements  ConsumerService {
    @Override
    public Map consumoerMark() {
        Map map = new HashMap();
        map.put("error","service is not used");
        return map;
    }
}
