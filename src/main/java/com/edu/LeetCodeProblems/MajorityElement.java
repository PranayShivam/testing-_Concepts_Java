package com.edu.LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,3};
        int k = majorityElement(nums);
        System.out.println(k);
    }

    private static int majorityElement(int[] nums) {

        int k = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num)+ 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())  {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                k = entry.getKey();
            }
        }
        return k;
    }
}
