package com.edu.LeetCodeProblems.Randoms;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {12, 0, 15, 22, 45, 39};
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
        
    }
}
