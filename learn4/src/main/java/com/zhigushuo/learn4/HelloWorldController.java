package com.zhigushuo.learn4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HelloWorldController {

    @RequestMapping("index1")
    public ModelAndView index1() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index1");

        modelAndView.addObject("title", "显示页面");
        modelAndView.addObject("description", "来吧，兄弟，跟我一起学spring boot2");

        return modelAndView;
    }

    @RequestMapping("index2")
    public ModelAndView index2(Model model) {


        model.addAttribute("title", "显示页面Z");
        model.addAttribute("description", "来吧，兄弟，跟我一起学spring boot2 Z");

        return  new ModelAndView("index2","model",model);
    }

    @RequestMapping("index3")
    public String index3(Model model) {
        model.addAttribute("title", "显示页面Z");
        model.addAttribute("description", "来吧，兄弟，跟我一起学spring boot2 Z");
        return  "index1";
    }

}
