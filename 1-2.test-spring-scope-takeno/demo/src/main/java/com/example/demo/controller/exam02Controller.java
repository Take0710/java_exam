package com.example.demo.controller;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.User;

@Controller
@RequestMapping("/ex02")
public class exam02Controller {
    @Autowired
    private HttpHeaders setHtt;

     @RequestMapping("")
public String extake(){
    return "exam02";
}
@RequestMapping("/exe02")
public String extake1(){
  return "exam02-result";
}
@RequestMapping("/exe3")
public String extake2(User User){
setHtt.allValues(null);
  return "exam02-result";
}
@RequestMapping("/exe4")
public String extake3(){
  return "exam02-result2";
}
}
