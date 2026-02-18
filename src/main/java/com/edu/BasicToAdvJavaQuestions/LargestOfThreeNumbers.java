package com.edu.BasicToAdvJavaQuestions;

public class LargestOfThreeNumbers {

    static int largestOf3Numbers(int a, int b, int c) {
        int max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }
}
