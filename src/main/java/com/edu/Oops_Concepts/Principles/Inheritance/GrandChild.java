package com.edu.Oops_Concepts.Principles.Inheritance;

public class GrandChild extends Child{

    double age;

    public GrandChild(){
        super();
        this.age = -1;
    }

    public GrandChild(double side, double weight, double age) {
        super(side, weight);
        this.age = age;
    }

    public GrandChild(double length, double width, double height, double weight, double age) {
        super(length, width, height, weight);
        this.age = age;
    }

    public void information() {
        String str = Double.toString(age);
        super.information(String.valueOf(age));
    }
}