package com.Dotin;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    @Autowired(required = false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
}

/*
By default, the @Autowired annotation implies the dependency is required
 similar to @Required annotation, however, you can turn off the default behavior
  by using (required=false) option with @Autowired.
 */