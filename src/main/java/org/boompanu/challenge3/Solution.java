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
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> groupAnagramMap = new HashMap<>();

        for (String tempStr : strs) {
            char[] tempChar = tempStr.toCharArray();
            Arrays.sort(tempChar);
            String anagram = new String(tempChar);
            if (!groupAnagramMap.containsKey(anagram)) {
                groupAnagramMap.put(anagram, new ArrayList<>(List.of(tempStr)));
            } else {
                groupAnagramMap.get(anagram).add(tempStr);
            }
        }

        groupAnagramMap.forEach((key, value) -> {
            result.add(value);
        });

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams(strs));  // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    }
}
