package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Memberdomain;



@Controller
@RequestMapping("/ex2")
public class ex2 {
    @RequestMapping("")
    public String text(){
        return "ex-thymeleaf-input";
    }
    @RequestMapping("/formex02")
    public String text1(Model model){
        Memberdomain memberdomain = new Memberdomain();
        
        model.addAttribute("memberdomain", memberdomain);
        return "ex-thymeleaf-result";
    }
}
