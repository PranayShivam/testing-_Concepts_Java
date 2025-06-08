package com.edu.Oops_Concepts.PART_3.Inheritance;

import java.util.Arrays;

public class Parent {
    private double length;
    double width;
    double height;

    public Parent() {
        super();
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    // Cube
    Parent(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Parent (double length, double width, double height){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // Known as Copy Constructor
    Parent (Parent parent) {
        this.length = parent.length;
        this.width = parent.width;
        this.height = parent.height;
    }

    public void information(String... str) {
        System.out.println("Running Parent");
        if (str != null){
            System.out.println(length + " " + height + " " + width + " " + Arrays.toString(str));
        } else System.out.println(length + " " + height + " " + width);
    }

}
