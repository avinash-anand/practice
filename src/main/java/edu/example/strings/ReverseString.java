package edu.example.strings;

import java.util.Arrays;

/***
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 *
 *
 * Follow up: Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class ReverseString {
    
    public static void main(String[] args) {
        var solution = new ReverseString();
        var input = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println("input = " + Arrays.toString(input));
        solution.reverseString(input);
        System.out.println("output = " + Arrays.toString(input));
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length + 1) / 2; i++) {
            var temp = s[i];
            s[i] = s[s.length - (i + 1)];
            s[s.length - (i + 1)] = temp;
        }
    }

}
