package com.edu.LeetCodeProblems.Randoms;

public class FibonacciSeries {

    ///  Fibonacci Series: 0 1 1 2 3 5 8 13 21.....
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(recursiveFib(i) + " ");
        }
    }

    private static String printFibonacciSeries(int n) {
        int first = 0;
        int second =  1;
        int next = 0;

        StringBuilder series = new StringBuilder();
        series.append(first).append(" ").append(second);
        for (int i = 0; i < n; i++) {
            series.append(" ");
            next = first + second;
            series.append(next);
            first = second;
            second = next;

        }

        return series.toString();
    }

    private static int recursiveFib(int n) {
        return n <= 1 ? n : recursiveFib(n - 1) + recursiveFib(n - 2);
    }
}
