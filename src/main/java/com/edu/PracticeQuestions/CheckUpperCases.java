package com.edu.PracticeQuestions;

import java.util.Scanner;

public class CheckUpperCases {
    public static void main(String[] args) {

        System.out.print("Enter a String:- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                counter++;
                builder.append(str.charAt(i));
            }
        }
        System.out.println("Number of Characters in UpperCase: " + counter);
        System.out.println("Characters that are in UpperCase: " + builder);
    }
}
