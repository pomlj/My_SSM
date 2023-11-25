package com.kangzhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("shop")
public class ShopController {

    @RequestMapping(value = "View",method = RequestMethod.GET)
    public String view(String a){
        System.out.println("你好"+a);
        return "index";
    }
    @RequestMapping(value = "ModelAndView",method = RequestMethod.GET)
    public ModelAndView modelAndView(String a){
        System.out.println("你好"+a);
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name","abcd");
        return modelAndView;
    }

    @RequestMapping(value = "Model",method = RequestMethod.GET)
    public String model(String a, Model model){
        System.out.println("你好"+a);
        model.addAttribute("name","abcd");

        return "index";
    }

    @RequestMapping(value = "Map",method = RequestMethod.GET)
    public String model(String a, Map map){
        System.out.println("你好"+a);
        map.put("name","abcde");
        return "index";
    }

}
