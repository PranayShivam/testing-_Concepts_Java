package com.edu.PracticeQuestions;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        int [] arr3 = new int[arr1.length+ arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        System.out.println(Arrays.toString(arr3));
    }
}
