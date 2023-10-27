package problemsolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * leetcode problem #823
 * finished in 26:13
 */
public class LC0823 {
    // best solution
    private static final int MOD_VAL = 1_000_000_007;
    public int numFactoredBinaryTrees(int[] arr) {
        if (arr.length == 1) return arr.length;
        int N = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[N];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < N; ++i)
            index.put(arr[i], i);

        for (int i = 0; i < N; ++i)
            for (int j = 0; j < i; ++j) {
                if (arr[i] % arr[j] == 0) { // A[j] is left child
                    int right = arr[i] / arr[j];
                    if (index.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[index.get(right)]) % MOD_VAL;
                    }
                }
            }

        long ans = 0;
        for (long x: dp) ans += x;
        return (int) (ans % MOD_VAL);
    }
}
