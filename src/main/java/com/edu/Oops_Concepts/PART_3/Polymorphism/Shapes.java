package com.edu.Oops_Concepts.PART_3.Polymorphism;

public class Shapes {

    // This is known as data hiding
    private double hiddenData;

    // Data hiding is achieved via Encapsulation
    // using getters and setters is Encapsulation
    // Encapsulation is a part of data hiding
    public void setHiddenData(double d) {
        this.hiddenData = d;
    }
    public double getHiddenData() {
        return hiddenData;
    }

    void area () {
        System.out.println("Area of Shapes");
    }

    static void greeting(){
        System.out.println("Greeting Inside Shapes");
    }
}
