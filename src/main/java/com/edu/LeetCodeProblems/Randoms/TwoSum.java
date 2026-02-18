package com.edu.LeetCodeProblems.Randoms;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {4,5,2,6,8,3};
        int target = 5;
        List<Integer> list = twoSum(arr, target);
        for (int i : list) {
            System.out.println("Index: " + i + ", Value: " + arr[i]);
        }
    }

    public static List<Integer> twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
                System.out.println(map);
            } else {
                list.add(i);
                list.add(map.get(target - arr[i]));
                return list;
            }
        }
        return null;

    }
}
