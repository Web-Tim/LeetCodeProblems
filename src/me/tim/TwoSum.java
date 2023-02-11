package me.tim;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem</a>
 * @author Tim
 * @since 11.02.2023
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSum(new int[]{3, 1, 3, 7, 12, 262, 27, 13, 712, 74, 13, 7, 1, 4, 32, 123, 26}, 275)));
    }

    private static int[] findSum(int[] array, int target) {
        int[] result = new int[2];
        int index = 0;
        while (index < array.length) {
            for (int i = 0; i < array.length; i++) {
                int elem = array[i];
                if (array[index] + elem == target) {
                    result[0] = index;
                    result[1] = i;
                    break;
                }
            }
            index++;
        }
        return result;
    }
}
