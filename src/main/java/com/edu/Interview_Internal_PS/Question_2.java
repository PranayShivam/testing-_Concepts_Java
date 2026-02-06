package com.edu.Interview_Internal_PS;

import java.util.Stack;

public class Question_2 {

    public static void main(String[] args) {
        int[] arr = {2, -3, -4, 5, 6, -7, 8};
        int[] arr_ = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (i<0) {
                stack.push(i);
            }
        }

        for (int i : arr) {
            if (i>0) {
                stack.push(i);
            }
        }

        System.out.println(stack);


    }


}
