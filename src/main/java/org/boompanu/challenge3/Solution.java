package org.boompanu.challenge3;

/*
Challenge 3: Group Anagrams
Problem:
Given an array of strings, group anagrams together.

Example:
Input: String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
*/
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Your code here
        return List.of(List.of(""));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams(strs));  // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    }
}
