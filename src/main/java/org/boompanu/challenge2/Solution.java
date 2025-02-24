package org.boompanu.challenge2;

/*
Challenge 2: Reverse Words in a String
Problem:
Given an input string s, reverse the order of the words.

Example:
Input: String s = "the sky is blue";
Output: "blue is sky the"
*/
public class Solution {
    public String reverseWords(String s) {
        String[] splitInput = s.trim().split("\\s+");
        StringBuilder output = new StringBuilder();
        for (int i = splitInput.length - 1; i >= 0; i--) {
            output.append(splitInput[i]);
            if (i != 0)
                output.append(" ");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "the sky is blue";
        String s2 = "the";
        String s3 = "the sky";
        System.out.println(sol.reverseWords(s));  // Output: "blue is sky the"
        System.out.println(sol.reverseWords(s2));  // Output: "blue is sky the"
        System.out.println(sol.reverseWords(s3));  // Output: "blue is sky the"
    }
}