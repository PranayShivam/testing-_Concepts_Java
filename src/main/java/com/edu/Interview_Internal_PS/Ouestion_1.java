package com.edu.Interview_Internal_PS;

import java.util.*;

public class Ouestion_1 {

    public static void main(String[] args) {


        ///  Print the most repeating number
        int [] arr = {2, 1, 3, 3, 4,4,4, 5,5,5};
        int max = Integer.MIN_VALUE;
        int key = 0;
        List<Integer> list = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> e : set) {
            if (e.getValue() > max) {
                max = e.getValue();
                key = e.getKey();
            }
        }

        for(Map.Entry<Integer, Integer> keys : set) {
            if (keys.getValue() == max) {
                list.add(keys.getKey());
            }
        }

        System.out.println(key);
        System.out.println(list);

    }
}
