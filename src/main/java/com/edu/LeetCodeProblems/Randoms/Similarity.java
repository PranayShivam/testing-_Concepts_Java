package com.edu.LeetCodeProblems.Randoms;

import java.util.*;

public class Similarity {

    public static void main(String[] args) {
        int[] a1 = {9,7,8,5,3,3,6,8,4,5};
        int[] a2 = {1,1,1,1,1,1,1,1,1};

        int[] a3 = {1, 2, 2, 3};
        int[] a4 = {2, 2, 2};
//        List<Integer> list  = similarity(a1, a2);
//        System.out.println(list);

        System.out.println(similarity_(a3, a4));
    }

    static List<Integer> similarity(int[] a1, int[] a2) {
        List<Integer> list = new LinkedList<>();
        if (a1.length != a2.length) throw new AssertionError("Require Arrays of Same Length");

        int maxLength = Math.max(a1.length, a2.length);
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < maxLength; j++) {
                if (a1[i] == a2[j] && !list.contains(a2[j])) {
                    list.add(a2[j]);
                }
            }
        }

        return list;
    }

    static List<Integer> similarity_(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i : a1) {
            set.add(i);
        }

        for (int n: a2) {
            if (set.contains(n)) {
                list.add(n);
                set.remove(n);
            }
        }

        return list;
    }
}
