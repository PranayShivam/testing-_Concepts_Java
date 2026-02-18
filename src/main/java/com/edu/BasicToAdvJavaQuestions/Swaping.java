package com.edu.BasicToAdvJavaQuestions;

public class Swaping {

    static void swapWith3rdVariable(int a, int b) {
        System.out.print("With Temp, Before Swaping...");
        System.out.println("a = " + a + ", b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After Swaping...");
        System.out.println("a = " + a + ", b= " + b);
    }

    static void swapWithout3rdVariable(int a , int b) {
        System.out.print("Without Temp, Before Swaping...");
        System.out.println("a = " + a + ", b= " + b);a ^= b;
        b ^= a;
        a ^= b;
        System.out.print("After Swaping...");
        System.out.println("a = " + a + ", b= " + b);


    }
}
