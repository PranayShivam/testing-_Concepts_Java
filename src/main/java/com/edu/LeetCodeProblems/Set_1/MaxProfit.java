package com.edu.LeetCodeProblems.Set_1;

public class MaxProfit {

    public static boolean isProfitable(int[] arr) {
        int lastCount = arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            if (lastCount > arr[i]) {
                lastCount = arr[i];
            }
        }
        return lastCount != arr[arr.length - 1];
    }

    public static int profit(int[] arr) {
        int leastValueIndex = 0;
        int leastValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < leastValue) {
                leastValue = arr[i];
                leastValueIndex = i;
            }
        }

        for (int i = leastValueIndex; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue-leastValue;
    }

    public static int maxProfit(int[] arr) {
        if(!isProfitable(arr)) {
            return 0;
        } else return profit(arr);
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
}
