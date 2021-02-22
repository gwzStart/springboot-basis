package com.xxx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:嘻嘻
 * @Date:2021/2/22 - 02 - 22 - 10:54
 * @Description:com.xxx.springboot.controller
 * @version:v1.0.0
 */
@Controller
public class IndexController {

   /* @RequestMapping("index")
    public String index(){
        return "index";
    }*/

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("msg", "hello spring boot");

        return "index";
    }


}
