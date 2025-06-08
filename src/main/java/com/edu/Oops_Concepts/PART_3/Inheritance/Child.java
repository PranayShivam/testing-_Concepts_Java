package com.edu.Oops_Concepts.PART_3.Inheritance;

import java.util.Arrays;

public class Child extends Parent{
    double weight;

    public Child() {
        super();
        this.weight = -1;
    }

    public Child(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public Child(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public void information(String... s) {
        String w = Double.toString(weight);
        super.information(w + Arrays.toString(s));
    }


    // This is a Copy Constructor
    // Here, when we write super(child), we access the copy constructor of Parent class
    // And We don't get an error as because Child class has access to all the Members of Parent for obvious reasons
    public Child(Child child) {
        super(child);
        weight = child.weight;
    }

    /**
     * public ParentWeight(){
     *         this.length = 10;
     *     }
     *
     * for the above example, length cannot be accessed as its declared Private
     * Members of a class those are declared as Private cannot be accessed by child class
     */

}