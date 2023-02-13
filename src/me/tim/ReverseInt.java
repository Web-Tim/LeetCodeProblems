package me.tim;

/**
 * @see <a href="https://leetcode.com/problems/reverse-integer/">LeetCode Problem</a>
 * @author Tim
 * @since 13.02.2023
 */
public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    private static int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder result = new StringBuilder();
        for (int i = s.toCharArray().length -1; i >= 0; i--) {
            result.append(s.toCharArray()[i]);
        }
        return Integer.parseInt(result.toString());
    }
}
