package org.boompanu.challenge1;

/*
Challenge 1: Longest Palindromic Substring
Problem:
Given a string s, return the longest palindromic substring in s.

Example:
Input: String s = "babad";
Output: "bab" or "aba"
*/

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;

        String longestPalindrome = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);

                if (isPalindrome(subString) && subString.length() > longestPalindrome.length()) {
                    System.out.println("isPalindrome : " + subString);
                    longestPalindrome = subString;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "babad";
        System.out.println(sol.longestPalindrome(s));  // Output: "bab" or "aba"
    }
}