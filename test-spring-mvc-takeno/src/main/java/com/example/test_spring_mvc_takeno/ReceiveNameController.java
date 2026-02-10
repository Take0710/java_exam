package com.example.test_spring_mvc_takeno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class ReceiveNameController {
       @ModelAttribute
    public ReceiveNameForm receiveNameForm(){
        return new ReceiveNameForm();
    }
 @RequestMapping("") 
    public String index() {
        return "exam-04";
    }

   @RequestMapping("shohei04")
    public String mizuhara1(ReceiveNameForm re){
        System.out.println("入力された値は"+re.getName()+"です");
        return "finishied";
    }
}
