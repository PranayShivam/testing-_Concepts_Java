package com.edu.Oops_Concepts.PART_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

        accessModifiers.arr = new int[]{1, 2, 3, 4, 5, 6};
//        accessModifiers.num = 10;
//        System.out.println(accessModifiers.num);
        System.out.println(Arrays.toString(accessModifiers.arr));

        accessModifiers.name = "Pranay";


        // Compulsory step to access Private variables
        // Known as encapsulation
        accessModifiers.setNum(10);
        System.out.println(accessModifiers.getNum());
    }
}
