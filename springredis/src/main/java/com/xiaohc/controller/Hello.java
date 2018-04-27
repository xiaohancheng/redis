package com.xiaohc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaohancheng
 * @create 2018-04-27 15:42
 * @desc 欢迎页
 **/
@Controller
@RequestMapping("/hello")
public class Hello {
    @Autowired
    private  RedisTemplate<String,String> redisTemplate;
    @RequestMapping("/sayHello")
    public String sayHello(){
       return "index";
    }
    @RequestMapping("/setAndGetHelloRedis/{value}")
    @ResponseBody
    public String setAndGetHelloRedis(@PathVariable("value") String value){
        redisTemplate.opsForValue().set("helloRedis","hello "+value+",you set a value to redis!");
        return redisTemplate.opsForValue().get("helloRedis");
    }
}
