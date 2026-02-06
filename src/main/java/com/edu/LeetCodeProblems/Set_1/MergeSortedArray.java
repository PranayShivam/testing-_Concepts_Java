package com.edu.LeetCodeProblems;

import java.util.Arrays;

public class MergeSortedArray {

    public String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(",");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] a = newArray(nums1);
        int[] b = newArray(nums2);
        int[] merged = new int[m+n];
        System.arraycopy(a, 0, merged, 0, m);
        System.arraycopy(b, 0, merged, m, n);
        Arrays.sort(merged);
        System.out.println(toString(merged));
    }

    private static int[] newArray(int[] arr) {
        int[] newArray =  new int[arr.length];
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                newArray[count] = i;
                count++;
            }
        }
        return Arrays.copyOf(newArray, count);
    }

    public static void main(String[] args) {
        MergeSortedArray a = new MergeSortedArray();
        a.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}

/**
 public static void main(String[] args) {

 int[] num1 = {1,2,3,0,0,0};
 int[] num2 = {2,5,6};
 int m = sizeOfArray(num1);
 int n = sizeOfArray(num2);
 int[] merged = new int[m+n];

 int[] a = newArray(num1);
 int[] b = newArray(num2);


 System.arraycopy(a, 0, merged, 0, m);
 System.arraycopy(b, 0, merged, m, n);
 Arrays.sort(merged);
 System.out.println(Arrays.toString(merged));

 }

 private static int sizeOfArray(int[] arr) {
 int length = 0;
 for (int i : arr) {
 if (i != 0) {
 length++;
 }
 }
 return length;
 }

 private static int[] newArray(int[] arr) {
 int[] newArray =  new int[arr.length];
 int count = 0;
 for (int i : arr) {
 if (i != 0) {
 newArray[count] = i;
 count++;
 }
 }
 return Arrays.copyOf(newArray, count);
 }
 } **/