package com.edu.LeetCodeProblems.Set_1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        solution solution = new solution();
        int sol = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(sol);
    }
}

class solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (characterSet.contains(c)) {
                characterSet.remove(s.charAt(left));
                left++;
            }

            characterSet.add(c);
            maxLength = Math.max(maxLength, i - left +1);
        }
        return maxLength;
    }
}