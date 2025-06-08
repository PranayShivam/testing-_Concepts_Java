package com.edu.PracticeQuestions;

public class Print1stAndLastIndex {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 7, 7, 8, 8, 10, 8};
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 8) {
                if (firstIndex == 0) {
                    firstIndex = i;
                } else {
                    lastIndex = i;
                }
            }
        }
        System.out.println(firstIndex + "" + lastIndex);
    }
}
