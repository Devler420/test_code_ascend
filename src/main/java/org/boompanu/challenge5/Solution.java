package org.boompanu.challenge5;

/*
Challenge 5: Decode String
Problem:
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is repeated exactly k times.
You may assume that the input string is always valid; no extra white spaces, square brackets are well-formed, etc.

Example:
Input: String s = "3[a2[c]]";
Output: "accaccacc"
*/

public class Solution {
    public String decodeString(String s) {
        // Your code here
        return "";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "3[a2[c]]";
        System.out.println(sol.decodeString(s));  // Output: "accaccacc"
    }
}