package com.edu.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntroToArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      Syntax for Array List
        /**
        we need to add wrapper classes , we cannot use Primitive data types here
         EVERY CLASS INHERITS THE OBJECT CALL >>>  OBJECT CLASS IS THE TOP LEVEL CLASS

         Internally the size is fixed, as soon as array list fills by some amount it will increase the size
         */
        ArrayList<Integer> arr = new ArrayList<>(10);  // Inside ArrayList<we need to store Class not Primitives
        ArrayList<String> str = new ArrayList<>(); // Declaring initial capacity is upto the coder
//      this is possible but not a good practice
        ArrayList demo = new ArrayList();
        demo.add("abc");
        demo.add(23);

        for (Object i: demo){
            System.out.println(i+"");
        }
        arr.add(67);
        arr.add(87);
        System.out.println(arr);
        System.out.println(arr.contains(76));

        // Enhanced for loop cant be used for Array list
//        for (int i = 0; i < 2; i++) {
//            arr.add(sc.nextInt());
//        }

        while (sc.hasNextInt()){ // this will stop as soon as an String is passed
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("Size: " + arr.size());
        System.out.println(arr);
    }
}
