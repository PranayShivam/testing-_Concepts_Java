package com.edu.LeetCodeProblems;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; // Input array
        int val = 3; // Value to remove
//        int[] expectedNums = {2,2}; // The expected answer with correct length.
//        // It is sorted with no values equaling val.
//
//        int k = removeElements(nums, val); // Calls your implementation
//
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < expectedNums.length; i++) {
//            assert nums[i] == expectedNums[i];

        System.out.println(removeElement(nums, val));
        }


    private static int removeElement(int[] nums, int val) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
