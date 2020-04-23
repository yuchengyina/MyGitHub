package com.hg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hg.service.imp.TestService;

@Controller
@RequestMapping("/test")
public class Test {

	@Autowired
	private TestService testService;
	
    @RequestMapping("/c")
    public String s(){
        System.out.println(testService.count());
        return "index";
    }

    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            if(i%6==2){
                i=i+7;
                System.out.println("a");
            }

        }
    }

}
