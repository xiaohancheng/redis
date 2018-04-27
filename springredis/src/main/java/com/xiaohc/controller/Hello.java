package com.xiaohc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaohancheng
 * @create 2018-04-27 15:42
 * @desc 欢迎页
 **/
@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping("/sayHello")
    public String sayHello(){
       return "index";
    }
}
