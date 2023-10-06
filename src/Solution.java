import java.util.*;

/**
 * space for putting solutions
 */
class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int hi = nums[nums.length - 1] - nums[0] + 1;
        int ans = hi;
        int lo = 0, mid;

        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (countThreshold(nums, mid) >= p) {
                hi = mid;
                ans = mid;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    private int countThreshold(int[] nums, int threshold) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] <= threshold) {
                i++;
                count++;
            }
        }

        return count;
    }


    public int maxProfit(int k, int[] prices) {
        int[][] dp = new int[k][prices.length];
        dp[k - 1][0] = 0;
        int min = prices[0];

        for (int j = 1, i = k - 1; j < prices.length; j++) {
            if (prices[i] < min) {
                min = prices[j];
                dp[i] = dp[i - 1];
            } else {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] - min);
            }
        }

        for (int i = k - 2; i >= 0; i--) {
            int max = prices[prices.length - 1];
            dp[k][prices.length - 1] = dp[k + 1][prices.length - 1];
            for (int j = prices.length - 2; j > 0; j--) {
                if (prices[i] > max) {

                } else {
                    dp[k][j] =  Math.max(dp[k][j + 1], max - prices[j] + dp[k][j]);
                }
            }
        }

        return 0;
    }
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
    public boolean winnerOfGame(String colors) {
        int aCnt=0,bCnt=0;
        int aTemp=0,bTemp=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                bTemp=0;
                aTemp++;
                if(aTemp>=3){
                    aCnt++;
                }
            }
            else{
                aTemp=0;
                bTemp++;
                if(bTemp>=3){
                    bCnt++;
                }
            }
        }
        return aCnt > bCnt;
    }
    public boolean isHappy(int n) { // leetcode #0202
        if (n == 1) return true;
        HashSet<Integer> seen = new HashSet<>();
        int x = n;
        while (x != 1) {
            int next = 0;
            while (x > 0) {
                int digit = x % 10;
                next += digit * digit;
                x /= 10;
            }
            if (!seen.add(next)) return false;
            x = next;
        }

        return true;
    }
}