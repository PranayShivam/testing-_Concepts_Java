package com.edu.PracticeQuestions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int armstrongNumber = sc.nextInt();

        int totalNumberOfDigits = String.valueOf(armstrongNumber).length();
        int sumOfDigits = 0;

        char[] digit  = String.valueOf(armstrongNumber).toCharArray();
        for (char i: digit) {
            sumOfDigits += (int) (Math.pow(Character.getNumericValue(i), totalNumberOfDigits));
        }

        if (sumOfDigits == armstrongNumber) {
            System.out.println(armstrongNumber + ": is an Armstrong Number");
        } else System.out.println(armstrongNumber + ": is not an Armstrong Number");

        sc.close();
    }
}
