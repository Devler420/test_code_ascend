package org.boompanu.challenge4;

/*
Challenge 4: Check if Two Strings are Anagrams
Problem:
Given two strings s and t, write a function to determine if t is an anagram of s.

Example:
Input: String s = "anagram"; String t = "nagaram";
Output: true
*/


import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charArrayInput1 = s.toCharArray();
        char[] charArrayInput2 = t.toCharArray();
        Arrays.sort(charArrayInput1);
        Arrays.sort(charArrayInput2);
        String result1 = Arrays.toString(charArrayInput1);
        String result2 = Arrays.toString(charArrayInput2);
        return result1.equals(result2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(sol.isAnagram(s, t));  // Output: true
    }
}