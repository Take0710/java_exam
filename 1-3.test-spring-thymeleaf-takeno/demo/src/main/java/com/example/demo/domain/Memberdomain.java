package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Memberdomain {
    private String name;
    private Integer age;
    List<String> hobbyList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    @Override
    public String toString() {
        return "Memberdomain [name=" + name + ", age=" + age + ", hobbyList=" + hobbyList + "]";
    }
}
