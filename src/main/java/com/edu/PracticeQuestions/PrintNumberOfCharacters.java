package com.edu.PracticeQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class PrintNumberOfCharacters {

    private static void charCount(String inputString){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] ch = inputString.toCharArray();

        for (char c: ch) {
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            } else hashMap.put(c,1);
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        charCount(s);
    }
}
