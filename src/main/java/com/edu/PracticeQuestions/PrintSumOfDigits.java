package com.edu.PracticeQuestions;

import java.util.Scanner;

public class PrintSumOfDigits {
    public static void main(String[] args) {
        PrintSumOfDigits.gptApproach();
    }

    private static void myApproach() {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        num = Math.abs(num);
        int sum = 0;

        char[] ch = String.valueOf(num).toCharArray();
        for (char i : ch) {
            sum+= Character.getNumericValue(i);
        }
        System.out.println(sum);
    }

    private static void gptApproach() {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close(); // Close scanner to avoid memory leaks

        int sum = 0;
        num = Math.abs(num); // Handle negative numbers

        while (num > 0) {
            System.out.println("num: " +num);
            sum += num % 10;// Extract the last digit and add to sum
            System.out.println("sum: "+ sum);
            num /= 10; // Remove last digit
            System.out.println("Lst: "+ num);
        }

        System.out.println("Sum of digits: " + sum);
    }
}
