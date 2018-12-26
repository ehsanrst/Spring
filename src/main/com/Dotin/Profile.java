package com.Dotin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name : " + student.getName());
    }
}

/*
  @Qualifier
  There may be a situation when you create more than one bean of the same type
   and want to wire only one of them with a property. In such cases,
    The @Qualifier annotation along with @Autowired can be used to remove
     the confusion by specifying which exact bean will be wired.
 */