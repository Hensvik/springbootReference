package com.kuangshen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /*@RequestMapping("/test")
    public String index() {
        return "test";
    }*/

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }
}
