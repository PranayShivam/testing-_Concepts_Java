package com.edu.PracticeQuestions;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(PrimeNumbers.isPrime(a));

    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        } return true;
    }
}
