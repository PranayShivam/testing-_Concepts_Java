package com.edu.demo.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    static { // Static Block
        System.out.println("Hello world in Static");
//        System.exit(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list);

        // Initializing the list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
