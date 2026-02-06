package com.edu.LeetCodeProblems.Set_2;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        int target = 6;
        int[] arr = twoSum(target,nums);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] + nums[i-1]) == target) {
                temp[0] = i-1;
                temp[1] = i;
            }
        }
        return temp;
    }

    public static int[] twoSum(int target, int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( (nums[i] + nums[j] == target ) ) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
