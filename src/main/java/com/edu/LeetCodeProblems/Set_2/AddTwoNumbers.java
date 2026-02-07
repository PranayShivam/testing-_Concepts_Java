package com.edu.LeetCodeProblems.Set_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {

        int[] l1 = {9,9,9,9,9,9,9};
        int[] l2 = {9,9,9,9};
        int[] l3 = {2,4,3};
        int[] l4 = {5,6,4};
        System.out.println(Arrays.toString(addTwoNumbers(l1, l2)));
        System.out.println(Arrays.toString(addTwoArrays(l1, l2)));
        System.out.println(Arrays.toString(addTwoNumbers(l3, l4)));
        System.out.println(Arrays.toString(addTwoArrays(l3, l4)));
    }


    public static int[] addTwoNumbers(int[] l1, int[] l2) {

        int length = Math.max(l1.length, l2.length);
        l1 = Arrays.copyOf(l1, length);
        l2 = Arrays.copyOf(l2, length);

        List<Integer> result = new ArrayList<>(length);
        int carryOver = 0;  // i = 0 :: remainder 10,

        for (int i = 0; i < length; i++) { //i = 1
            int sum = l1[i] + l2[i] + carryOver; // 9 + 9
            result.add(sum % 10);
            carryOver = sum / 10;
        }

            /*if (j >= 10) {
                list.add(j % 10); //j = 18, temp[i] = 8
                carryOver = Integer.parseInt(String.valueOf(j).substring(0, 1)); // 18 - 8
                continue;
            } else carryOver = 0;
            list.add(j);*/

        if (carryOver > 0) {
            result.add(carryOver);
        }

        int[] temp = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            temp[i] = result.get(i);
        }

        return temp; // {8,
    }

    public static int[] addTwoArrays(int[] l1, int[] l2) {

        int a = Integer.parseInt(String.valueOf(conversion(l1)));
        int b = Integer.parseInt(String.valueOf(conversion(l2)));

        String str  = String.valueOf(a + b);
        char[] c = String.valueOf(new StringBuilder(str).reverse()).toCharArray();
        int[] temp = new int[c.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Character.getNumericValue(c[i]);
        }

        return temp;
    }

    private static StringBuilder conversion(int[] arr) {
        StringBuilder b = new StringBuilder();
        for (int i : arr) {
            b.append(i);
        }
        return b;
    }

}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */