package com.edu.Oops_Concepts.Polymorphysm;

/**
 * This is an example of Compile Time Polymorphism
 * Which is also known as Method OverLoading
  */
public class CompileTimePolymorphism {
    int sum (int a , int b){
        return a+b;
    }

    int sum (int a, int b, int c) {
        return a+b+c;
    }

    double sum(double a, double b){
        return a+b;
    }

    // Run Time Polymorphism
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        System.out.println(obj.sum(2.3, 4.4));
    }
}
/**
 * When obj.sum is called, as per the number of parameters/arguments given, in compile time it
 * is determined which method to call.
 */