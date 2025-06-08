package com.edu.LeetCodeProblems;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array

        System.out.println(removeElement(nums));
    }

    private static int removeElement(int[] nums) {
        if (nums.length == 0 ){
            return 0;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
