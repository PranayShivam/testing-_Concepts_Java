package com.edu.Oops_Concepts.PART_5.AbstactClasses;

public class Child_1 extends ParentClass{

    private String name;
    private int age;

    void greeting() {
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        super.gender = "Male  ";
    }

    @Override
    void career(String name) {
        this.name = name;
        System.out.println("Career Selected by Child 1 is "+ name);
    }

    @Override
    void partner(String name, int age) {
        this.age = age;
        System.out.println("Partner name is "+ name + ". Age is " + age);
    }
}
