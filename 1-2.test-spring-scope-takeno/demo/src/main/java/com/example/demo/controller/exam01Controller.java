package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.Ex01From;




@Controller
@RequestMapping("/ex01")
public class exam01Controller {
    @ModelAttribute
    public Ex01From  setex01from(){
        return new  Ex01From ();
    }
    @RequestMapping("")
public String extake(){
    return "exam01";
}
@RequestMapping("/exrerult01")
public String exrerult01(Ex01From ex, Model model){
    if("yamada@sample.com".equals(ex.getEmail())&&"yamayama".equals(ex.getPass())){
        model.addAttribute("name","成功");
    }else{
model.addAttribute("name","失敗");
    }
    return "exam01-re";
}
}
