package com.edu.Oops_Concepts.PART_5.AbstactClasses;

public class Main {
    public static void main(String[] args) {

        Child_1 one = new Child_1();
        Child_2 two = new Child_2();

        one.career("Developer");
        two.career("Doctor");

        one.greeting();
        two.greeting();

        one.partner("ABC", 27);
        two.partner("DEF", 28);

        /**
         * The below object creation gives an error because, we cannot create objects of Abstract Classes
         * Thus, it gives an error
         */
//        ParentClass parentClass =  new ParentClass();

        // Calling static methods
        ParentClass.welcome();
    }
}
