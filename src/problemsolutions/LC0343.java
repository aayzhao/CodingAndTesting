package problemsolutions;

/**
 * Leetcode problem #343
 * Solved in 22:51
 */
public class LC0343 {
    public int integerBreak(int n) {
        if (n < 4) return n - 1;
        int[] dp = new int[n + 1];
        for (int i = 0; i < 4; i++) dp[i] = i;
        for (int i = 4; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j < i; j++) dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
        }

        return dp[n];
    }
}
