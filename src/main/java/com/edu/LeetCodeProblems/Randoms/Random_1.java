package com.edu.LeetCodeProblems.Randoms;

import java.util.Arrays;
import java.util.Collections;

public class Random_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[] {2,0,2,1,1,0})));
    }


    /// General Sorting mechanism
    public static int[] sortColors(int[] nums) {
        int red = 0;
        int white = 0;

        for (int i : nums) {
            if (i == 0) {
                red++;
            } else if (i == 1) {
                white++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (red > 0) {
                nums[i] = 0;
                red--;
            } else if (white > 0) {
                nums[i] = 1;
                white--;
            } else nums[i] = 2;
        }

        return nums;
    }


    /// Dutch National Flag Algorithm
    /// input array - {2,0,2,1,1,0}
    public static int[] dnfAlgo(int[] arr) {
        int p1 = arr[0];                 // 1st -> 2
        int p2 = arr[0];                    // 1st -> 2
        int p3 = arr[arr.length-1];             // 6th -> 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[p2] > arr[p1]) {

            } else if (arr[p2] == arr[p3]) {
                Collections.swap(Arrays.asList(arr), arr[p2], arr[p3]);
            }
        }

        return arr;
    }

    void swap(int a, int b) {

    }


}
