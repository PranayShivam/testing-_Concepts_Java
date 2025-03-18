package com.edu.Oops_Concepts.Polymorphysm;

public class Numbers {
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
        Numbers numbers = new Numbers();
        System.out.println(numbers.sum(2.3, 4.4));
    }
}
