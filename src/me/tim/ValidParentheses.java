package me.tim;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">LeetCode Problem</a>
 * @author Tim
 * @since 12.02.2023
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{)]]()"));
    }

    private static char getInverseParenthese(char c) {
        switch (c) {
            case '(':
                return ')';
            case ')':
                return '(';
            case ']':
                return '[';
            case '[':
                return ']';
            case '}':
                return '{';
            case '{':
                return '}';
            default:
                return ' ';
        }
    }

    private static boolean isCloseParenthese(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean isValid(String s) {
        char lastChar = s.toCharArray()[0];
        for (int i = 1; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if (isCloseParenthese(c) && lastChar != getInverseParenthese(c)) {
                return false;
            } else if (!isCloseParenthese(c) && !isCloseParenthese(lastChar)) {
                return false;
            }
            lastChar = c;
        }
        return true;
    }
}
