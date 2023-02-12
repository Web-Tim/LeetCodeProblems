package me.tim;

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">LeetCode Problem</a>
 * @author Tim
 * @since 12.02.2023
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}
