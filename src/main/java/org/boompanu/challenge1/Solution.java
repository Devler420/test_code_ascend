package org.boompanu.challenge1;

/*
Challenge 1: Longest Palindromic Substring
Problem:
Given a string s, return the longest palindromic substring in s.

Example:
Input: String s = "babad";
Output: "bab" or "aba"
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {
        // Your code here
        s = s.toLowerCase();

        // "babad"
        // "level"
        // "redder"
        // "abcmadamefg" length == 11 s.charAt(10) == g
        // "abcmadame" length == 9 s.charAt(8) == e

        Map<String, Integer> palindromLengthStartIndexEndIndexMap = new HashMap<>(); // 1. Length 2.StartIndex 3.EndIndex

        int j = s.length() - 1;
        System.out.println("s length: " + s.length());
        for (int i = 0; i < s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                // Palindrome Broke Here
                System.out.println("i: " + i + " " + s.charAt(i));
                System.out.println("j: " + j + " " + s.charAt(j));
//                if (palindromLengthStartIndexEndIndexMap.isEmpty()) {
//                    palindromLengthStartIndexEndIndexMap.put("length", j-1);
//                    palindromLengthStartIndexEndIndexMap.put("start", i+1);
//                    palindromLengthStartIndexEndIndexMap.put("end", j);
//                    j--;
//                    continue;
//                }

                if (palindromLengthStartIndexEndIndexMap.get("length") < (j-1)) {
                    palindromLengthStartIndexEndIndexMap.put("length", j-1);
                    palindromLengthStartIndexEndIndexMap.put("start", i+1);
                    palindromLengthStartIndexEndIndexMap.put("end", j);
                }
            }
            j--;
        }

        if (palindromLengthStartIndexEndIndexMap.isEmpty()) {
            // Whole Input is a palindrome
            System.out.println("Whole Input is a palindrome");
            return s;
        }

        Integer finalLength = palindromLengthStartIndexEndIndexMap.get("length");
        Integer finalStart = palindromLengthStartIndexEndIndexMap.get("start");
        Integer finalEnd = palindromLengthStartIndexEndIndexMap.get("end");
        System.out.println("finalLength: " + finalLength);
        System.out.println("finalStart: " + finalStart);
        System.out.println("finalEnd: " + finalEnd);

        return s.substring(finalStart, finalEnd);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "babad";
//        System.out.println(sol.longestPalindrome(s));  // Output: "bab" or "aba"
//        System.out.println(sol.longestPalindrome("level"));  // Output: "level"
        System.out.println(sol.longestPalindrome("abcmadamefg"));  // Output: "madam"

    }
}