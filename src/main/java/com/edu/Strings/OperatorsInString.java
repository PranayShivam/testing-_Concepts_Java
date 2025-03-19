package com.edu.Strings;

import java.util.ArrayList;

public class OperatorsInString {
    public static void main(String[] args) {

        System.out.println('a' + 'b');   // Java Converts char a and char b to its ASCII Values and then adds them
        System.out.println('A' + 'b');   // Same as Above

        // To Add two Chars and make it a string
        String a = "a";
        String b = "b";
        System.out.println(a+b);  /* OR */  System.out.println("a" + "b");

        //Examples
        System.out.println('a' + 3); // O/p = 100
        System.out.println("a"+3);   // O/p = a3  // Here, integer is converted to String, Internally its "a" + "1"

        // Casting Example 1 to Character Value
        System.out.println((char)('a'+3));  // d

        // String + Objects
        System.out.println("Pranay" + new ArrayList<>());
//        Integer i = new Integer(89);  Deprecated
        System.out.println("PRB"+ Integer.valueOf(67));
//        System.out.println(90 + new ArrayList<>()); --> This throws an Error
        /**
Operator + in java can be used with primitives and concatenating with all complex objects as well but with only one condition:
         At-least one of these objects should be of Type String
         The + Operator is the only operator in java that is intentionally Overloaded with concatenating two strings
         this is known as Operator Overloading.
         */
        System.out.println(90 + "" +new ArrayList<>());  // The entire result will be of String Type

    }
}
