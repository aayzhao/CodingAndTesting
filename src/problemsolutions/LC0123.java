package problemsolutions;

/**
 * leetcode problem #0123
 * solved in 35:45
 */
public class LC0123 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int profit = Integer.MIN_VALUE;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.max(prices[i] - min, dp[i - 1]);
            }
        }
        int max = prices[prices.length - 1];
        profit = dp[prices.length - 1];
        for (int i = prices.length - 2; i > 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
            } else {
                profit = Math.max(profit, max - prices[i] + dp[i - 1]);
            }
        }

        return profit;
    }
}
