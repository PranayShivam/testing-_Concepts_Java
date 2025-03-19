package com.edu.Arrays;
import java.util.Arrays;
import java.lang.*;
public class IntroToArrays {

    public static void main(String[] args) {
		System.out.println("Hello World!");
    int a = 10; // Integer
    String str = "Pranay KR"; // String

    // to create multiple roll Numbers
    int roll1 = 23;
    int roll2 = 25;
    int roll3 = 10;
    //''
    //''
    //''

    // Array is a collection of data types
    // All data types inside an array should be same

    //Syntax for Arrays
    //datatype [] varName = new datatype[Size]

    // Store 5 roll numbers
    int roll[] = new int[5];
    // or directly
    int roll11[] = {21, 33, 45, 56, 78};

    int ros[]; // declaration of an array in stack memory and is created in compile time
    ros = new int[5]; // actually memory creation in heap memory is created in run time

		for(int i=0; i<ros.length; i++){
        System.out.println(ros[i]);
    }
		System.out.println("Array" + Arrays.toString(roll11));

    int b = 10;  // this is stored in stack memory
    Integer i = new Integer(10); // this is stored in heap
//        Integer in = Integer.valueOf(10); Newer way
		System.out.println(i);

    // Mutability
    int num [] = new int [3];
    // Print before change  -----Strings are immutable in java but Arrays are mutable in java
		System.out.println(Arrays.toString(num));
    change(num); // Calling Static function
		System.out.println(Arrays.toString(num));
}

// Passing functions
static void change (int[] arr) {
    arr[1] = 99;
}
}
