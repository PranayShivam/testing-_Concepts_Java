package com.edu.PracticeQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * input String: PranayPranay
 * output String: Pranay
 */
public class PracticeQuestion_2 {
    public static void main(String[] args) {

        String str = "PranayPranay";
        LinkedHashMap<Character, Integer> hashMap= new LinkedHashMap<>();
        char[] ch = str.toCharArray();

        for (char c: ch) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c)+1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap.keySet() + "\uD83D\uDE83");
    }
}
