package com.edu.LeetCodeProblems.Set_1.SolutionsInLeetCode;

/**
 * As per MaxProfit code
 * Location = package com.edu.LeetCodeProblems.Set_1.MaxProfit
 */
public class Best_Time_To_Buy_And_Sell_Stocks_121 {

    static class Solution {
        public int maxProfit(int[] prices) {
            if(!isProfitable(prices)) {
                return 0;
            } else return profit(prices);
        }

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


    }
}
