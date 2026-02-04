package com.example.test_spring_mvc_takeno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
    @RequestMapping("")
    public String otani(){
        return "name-form";
    }
   @RequestMapping("shohei03")
    public String mizuhara(String name){
        System.out.println("入力された値は"+name+"です");
        return "finishied";
    }
}
