package com.edu.Oops_Concepts.PART_3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(4);
//        System.out.println(parent.height + " " + parent.width + " " + parent.length);

        Child pw = new Child(10, 10, 10, 10);
        pw.information();
//        System.out.println(pw.length);  // Though its initialized, but we still cannot access

        Parent pw1 = new Child(10,10,10,10);
        pw1.information();  // This will not print the value of members of the Child Class as those are not accessible

        // When you try to ref a child to a parent object
        // Here we cannot initialize weight that is a member of Child Class as parent dosnt have access to it
        // Thus, we cannot access the constructor as well, as its inside child class
        // Hence weight cannot be initialized using child ref of Parent obj
//        ParentWeight pw2 = new Parent(10, 10, 10) // this cant be done as logical behaviour

        GrandChild gc = new GrandChild(10, 10, 10);
        gc.information();


    }
}
