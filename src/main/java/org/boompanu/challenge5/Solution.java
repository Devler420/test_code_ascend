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

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            System.out.println("i: " + i + " | s.charAt(i): " +s.charAt(i));
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int startIndex = i;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                int count = Integer.parseInt(s.substring(startIndex, i));
                countStack.push(count);
            } else if (ch == '[') {
                stringStack.push(currentString);
                currentString = new StringBuilder();
                i++;
            } else if (ch == ']') {
                StringBuilder temp = stringStack.pop();
                System.out.println("stringStack POP: " + temp);
                int repeatCount = countStack.pop();
                System.out.println("countStack POP: " + repeatCount);
                String repeatedString = currentString.toString();

                for (int j = 0; j < repeatCount; j++) {
                    System.out.println("j : " + j);
                    System.out.println("tempBefore: " + temp);
                    temp.append(repeatedString);
                    System.out.println("tempAfter: " + temp);
                }
                currentString = temp;
                i++;
            } else {
                currentString.append(ch);
                i++;
            }
//            System.out.println("StringStack: " + stringStack);
//            System.out.println("CountStack: " + countStack);
            System.out.println("currentString: " + currentString.toString());
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "3[a2[c]]";
        System.out.println(sol.decodeString(s));  // Output: "accaccacc"
//        System.out.println(sol.decodeString("3[a]2[bc]"));
//        System.out.println(sol.decodeString("2[abc]3[cd]ef"));
    }
}