package me.tim;

/**
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">LeetCode Problem</a>
 * @author Tim
 * @since 11.02.2023
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("XVIII"));
    }

    // Maybe make a better way to handle algorithmic error --> IV - (I | 1) - (V | 4 - I)
    private static int romanToInt(String romanChar) {
        int result = 0;
        char lastChar = ' ';
        for (char c : romanChar.toCharArray()) {
            int add;
            switch (c) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    add = (lastChar == 'I' ? 3 : 5);
                    result += add;
                    break;
                case 'X':
                    add = (lastChar == 'I' ? 8 : 10);
                    result += add;
                    break;
                case 'L':
                    add = (lastChar == 'X' ? 30 : 50);
                    result += add;
                    break;
                case 'C':
                    add = (lastChar == 'X' ? 80 : 100);
                    result += add;
                    break;
                case 'D':
                    add = (lastChar == 'C' ? 300 : 500);
                    result += add;
                    break;
                case 'M':
                    add = (lastChar == 'C' ? 800 : 1000);
                    result += add;
                    break;
            }
            lastChar = c;
        }
        return result;
    }
}
