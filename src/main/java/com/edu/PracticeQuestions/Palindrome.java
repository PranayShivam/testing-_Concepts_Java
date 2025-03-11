package com.edu.PracticeQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        if(usingStringBuilder(str)) {
            System.out.println("String is Palindrome");
        } else System.out.println("String is not Palindrome");
    }

    public static boolean nonOptimizedPalindromeCode(String str){
        boolean isPalindrome = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1; j >= 0; j--) {
                isPalindrome = str.charAt(j) == str.charAt(i);
            }
        }
        return isPalindrome;
    }

    public static boolean usingStringBuilder(String str) {
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        return str1.toString().equals(str);
    }
}
