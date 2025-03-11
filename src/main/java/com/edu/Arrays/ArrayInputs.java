package com.edu.Arrays;
import java.util.*;
import java.lang.*;
public class ArrayInputs {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        arr[3] = 25;
        arr[4] = 30;

//		System.out.println(arr[3]);


// Accepting inputs from user
        for (int i =0;i<arr.length ;i++ )	{
            arr[i] = sc.nextInt();
        }

// Printing the arrays
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

// Enhanced for Loop

// Syntax :
// for (datatype refVarName : arrayName) { print refVarName }   for every element in array print that element
        for (int j : arr){
            System.out.print(j + " ");
        }

// Array of Objects

        String [] str = new String[4];
        str[0] = "Hello";
        str[1] = "World";

        System.out.println(Arrays.toString(str));
    }
}