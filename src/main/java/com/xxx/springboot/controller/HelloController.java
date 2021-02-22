package com.xxx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther:嘻嘻
 * @Date:2021/2/21 - 02 - 21 - 21:38
 * @Description:com.xxx.springboot.controller
 * @version:v1.0.0
 */

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello spring boot";
    }

}
