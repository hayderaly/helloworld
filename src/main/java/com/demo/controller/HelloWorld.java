package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/hello")
    public  String hello() {
        System.out.println("----------merge info-----------");
        return  "Hello World...hi git..hi SSH..not commit";
    }
}
