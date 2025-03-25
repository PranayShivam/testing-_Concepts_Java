package com.edu.Oops_Concepts.PART_5.AbstactClasses;

public class Child_2 extends ParentClass{

    private String name;
    private int age;

    void greeting() {
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
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
