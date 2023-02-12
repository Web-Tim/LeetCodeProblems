package me.tim;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode Problems</a>
 * @author Tim
 * @since 12.02.2023
 */
public class BestStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 6, 16, 12, 78, 1}));
    }

    private static int maxProfit(int[] prices) {
        // Get the smallest number and its index
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }

        // early return if the smallest number is at the end of the array
        if (minIndex == prices.length - 1) return 0;

        // getting the biggest number behind the min number
        int bestCheckout = 0;
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] > bestCheckout) {
                bestCheckout = prices[i];
            }
        }

        // returning difference between max and min (profit)
        return bestCheckout - min;
    }
}
