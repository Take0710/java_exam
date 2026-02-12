package com.example.demo.form;

public class User {
    private Integer num1;
    private Integer num2;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    @Override
    public String toString() {
        return "User [num1=" + num1 + ", num2=" + num2 + "]";
    }
    
}
