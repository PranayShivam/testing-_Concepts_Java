package com.edu.demo.Strings;

public class StringComparision {
    public static void main(String[] args) {

        String a = "Pranay";
        String b = "Pranay";

        String s1 = new String("Pranay");  // This creates an object in the heap memory
        String s2 = new String("Pranay");   // ""

        System.out.println(a == b);
        System.out.println(s1 == s2); // When we use new Object which is used to create obj, thus s1 and s2 are in different location

        System.out.println(s1.equals(s2));

        // == -> Comparison Operator  compares the location in the Memory
        /**
         * int num1 = 10;
         * int num2 = 10;
         * System.out.println(num1 == num2); // == True

         * this returns true because both of them are in stack memory, so == compares the values directly


        // Integer Caching
        Integer k = 10;
        Integer l = 10;

        Integer m = 200;
        Integer n = 200;

        System.out.println("kl: "+ (k == l));
        System.out.println("mn: "+ (m == n));
         */


    }
}
