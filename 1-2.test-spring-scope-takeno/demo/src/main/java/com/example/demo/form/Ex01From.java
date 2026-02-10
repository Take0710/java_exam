package com.example.demo.form;

public class Ex01From {
    private String email;
     private String pass;
     public String getEmail() {
         return email;
     }
     public void setEmail(String email) {
         this.email = email;
     }
     public String getPass() {
         return pass;
     }
     public void setPass(String pass) {
         this.pass = pass;
     }
     @Override
     public String toString() {
        return "Ex10From [email=" + email + ", pass=" + pass + "]";
     }
     
}
