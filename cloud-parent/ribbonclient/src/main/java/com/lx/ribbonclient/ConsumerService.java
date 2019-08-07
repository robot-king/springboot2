package com.lx.ribbonclient;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "consumerMarError")
    public Map consumerMark() {
        return restTemplate.getForObject("http://RIBBONSERVICE/mark", Map.class);
    }
    @HystrixCommand(defaultFallback = "consumerMarError")
    public Map consumerMark2() {
        return restTemplate.getForObject("http://RIBBONSERVICE/mark", Map.class);
    }

    public Map consumerMarError() {
        Map<String,String> map = new HashMap<>();
        map.put("error","service is not used");
        return map;
    }


}
