package com.redofmaple.test;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {


    private String name;
    private transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
