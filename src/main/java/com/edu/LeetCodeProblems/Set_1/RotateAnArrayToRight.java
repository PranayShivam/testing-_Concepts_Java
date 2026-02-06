package com.edu.LeetCodeProblems.Set_1;

import java.util.Arrays;

public class RotateAnArrayToRight {

    private static void rightRotate(int[] arr, int k) {
        for (int i = arr.length; i > k; i--) {
            rightRotateByOne(arr);
        }
    }

    private static void rightRotateByOne(int[] arr)  {
        int i, temp, n = arr.length;
        temp = arr[0];
        for (i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(arr.length);
        RotateAnArrayToRight.rightRotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
