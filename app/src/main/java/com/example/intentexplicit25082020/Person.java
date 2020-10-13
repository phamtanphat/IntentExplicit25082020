package com.example.intentexplicit25082020;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
