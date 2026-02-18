package com.edu.BasicToAdvJavaQuestions;

public class prob_1_CheckOddEven {
    public static void main(String[] args) {
        /*System.out.println(checkEvenOdd(5, 7));*/

        System.out.println(bitwiseOddEven(2,4));
    }

    // Condition: one input should be even
    static int checkEvenOdd(int a, int b) {
        return (a%2 == 0) ? a : b;
    }

    // Using BitWise
    static int bitwiseOddEven(int a, int b) {
        if ( (a & 1) == 0) return a;
        if ((b & 1) == 0) return b;
        else return 0;
    }
}
