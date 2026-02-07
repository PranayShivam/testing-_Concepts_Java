package com.edu.LeetCodeProblems.Set_2;

import java.util.Arrays;

public class AddTwoNumbers {

    public static void main(String[] args) {

        int[] l1 = {9,9,9,9,9,9,9};
        int[] l2 = {9,9,9,9};
        System.out.println(Arrays.toString(addTwoNumbers(l1, l2)));
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
    public static int[] addTwoNumbers(int[] l1, int[] l2) {

        int length = Math.max(l1.length, l2.length);
        int[] temp = new int[length];
        int carryOver = 0;
        for (int i = 0; i < length; i++) {
            if (l1.length > l2.length) {
                
            }
            int j = l1[i] + l2[i];
            if (j >= 9) {
                carryOver = j - 9;
                temp[i] = 0;
                continue;
            }
            temp[i] = j + carryOver;
        }
        return temp;
    }
}
