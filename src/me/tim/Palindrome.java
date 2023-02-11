package me.tim;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/">LeetCode Problem</a>
 * @author Tim
 * @since 11.02.2023
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(126621));
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

    private static String[] getHalfSplit(String string) {
        String[] split = new String[2];
        split[0] = string.substring(0, string.length() / 2);
        split[1] = string.substring(string.length() / 2 + (isEven(string.length()) ? 0 : 1));
        return split;
    }

    private static boolean isPalindrome(int x) {
        String xCast = String.valueOf(x);
        if (xCast.length() == 1) {
            return true;
        }

        // Out-sourced method to get the string split in half --> "abc" - ["a", "c"] | "abcd" - ["ab", "cd"]
        String[] split = getHalfSplit(xCast);
        System.out.println(Arrays.toString(split));

        // Reverse the String
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = split[1].length() - 1; i >= 0; i--) {
            stringBuilder.append(split[1].charAt(i));
        }

        return split[0].equalsIgnoreCase(stringBuilder.toString());
    }
}
