package me.tim;

/**
 * @author Tim
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">LeetCode Problem</a>
 * @since 11.02.2023
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(getLongestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    // TODO
    private static String getLongestCommonPrefix(String[] strings) {
        int bestLength = 0;
        String first = strings[0];
        for (int j = 1; j < strings.length; j++) {
            String current = strings[j];

            int length = 0;
            for (int i = 0; i < current.toCharArray().length; i++) {
                if (first.toCharArray()[i] != current.toCharArray()[i]) break;
                length++;
            }
            System.out.println(length);

            if (length > bestLength) {
                bestLength = length;
            }
        }
        return first.substring(0, bestLength);
    }
}
