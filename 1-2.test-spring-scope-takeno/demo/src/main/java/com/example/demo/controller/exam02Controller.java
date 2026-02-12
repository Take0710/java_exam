package com.example.demo.controller;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class exam02Controller {
    @Autowired
    private HttpSession session; 

     @RequestMapping("")
public String extake(){
    return "exam02";
}
@RequestMapping("/exe02")
public String extake1(){
  return "exam02-result";
}
@RequestMapping("/exe3")
public String extake2(Integer num1,Integer num2){
int num3 = num1 + num2;
    session.setAttribute("num1", num1);
session.setAttribute("num2", num2);
session.setAttribute("num3", num3);
  return "exam02-result";
}
@RequestMapping("/exe4")
public String extake3(){
  return "exam02-result2";
}
}
