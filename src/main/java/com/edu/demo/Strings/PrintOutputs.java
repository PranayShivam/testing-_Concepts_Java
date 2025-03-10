package com.edu.demo.Strings;

import java.util.Arrays;

public class PrintOutputs {
    public static void main(String[] args) {
        int num1 = 56;
        Integer num2 = 56;
        System.out.println(num1);  // This is a primitive type
        System.out.println(num2);  // This is object type (Wrapper Class)
        System.out.println("abc");
        System.out.println(new int[]{23, 56, 77});
        System.out.println(Arrays.toString(new int[]{23, 56, 77}));

        number(10);
//        number(10, "Hii", "World");
    }

    public static void number (int i, String... s){
        System.out.println(i);
        if (s.length> 0){
            System.out.println(Arrays.toString(s));
        }
    }
}
