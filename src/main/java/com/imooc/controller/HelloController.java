package com.imooc.controller;

import com.imooc.properties.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;


    @RequestMapping("/say")
    public String say() {
        return "跟慕课网廖师兄学SpringBoot!";
    }
}
