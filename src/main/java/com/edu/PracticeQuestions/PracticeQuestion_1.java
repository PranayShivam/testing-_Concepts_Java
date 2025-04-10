package com.edu.PracticeQuestions;

import java.util.Scanner;

/**
 * Problem:
 * Eg_1: Input String: a1b2c3
 * O/p: abbccc
 */
public class PracticeQuestion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String. ");
        System.out.print("Strings can be in the format: \n a2b3c4 or \n 2a3b4c etc...\n");

        String str = sc.next();
        StringBuilder characters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder finalString = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char c: ch){
            if (Character.isLetter(c)){
                characters.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            } else System.out.println("Invalid Input");
        }

        String str1 = String.valueOf(characters);
        String str2 = String.valueOf(numbers);

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        for (int i = 0; i < c2.length; i++) {
            int repeatCount = Character.getNumericValue(c2[i]);
            finalString.append(String.valueOf(c1[i]).repeat(Math.max(0, repeatCount)));
        }
        System.out.println(finalString);
    }
}
