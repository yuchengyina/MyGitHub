package com.hg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/c")
    public String s(){
        System.out.println("111");
        return "index";


    }

}
