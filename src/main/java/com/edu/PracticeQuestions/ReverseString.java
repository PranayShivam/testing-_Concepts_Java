package com.edu.PracticeQuestions;

import java.util.Scanner;

public class ReverseString {
    public String reverse() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String outPut = "";

        // Suppose String is Pranay
        for(int i=str.length()-1; i>=0; i--) {
            outPut = outPut + str.charAt(i);
        }
        return outPut;
    }
}
