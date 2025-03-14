package com.edu.Oops_Concepts.Introduction_PART_2;

public class Human {
    int age;
    String name = "Pranay";
    int salary;
    boolean isMarried;

    /**
     * Static variables or Methods are used when there is a property that is common across all the objects
     * These variables are such properties that are not directly related to the Object
     */
    static long population;
    static String newName = "Shivam";

    // Non-Parameterized Constructor
    public Human() {}

    // Parameterized Constructor
    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;

 /*     this.population +=1;
        this keyword works same but is not recommended to use as population is a static variable and
        static variables are a part of class not of a particular Object  also Static variables should not be
        called using instance(this keyword)
         Static Variables/Methods belong to the Class not to the Object*/

        Human.population+=1;
    }

    static void message() {
        System.out.println("Input Taken");
//        this.age;     // From static we cannot use non-static stuff
    }
}
