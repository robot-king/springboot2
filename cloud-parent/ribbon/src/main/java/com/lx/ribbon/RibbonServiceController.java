package com.lx.ribbon;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RibbonServiceController {

    @Value("${my.mark}")
    private String mark;

    @RequestMapping(value = "/mark",method = RequestMethod.GET)
    public Map<String,String> getRibbonService(){
        Map<String,String> map = new HashMap<>();
        map.put("myMark",mark);
        return map;
    }


}
