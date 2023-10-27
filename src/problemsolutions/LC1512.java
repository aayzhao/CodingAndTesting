package problemsolutions;

import java.util.HashMap;

/**
 * leetcode problem #1512
 * Completed in 13:01
 */
public class LC1512 {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int res = 0;
        for (int i : nums) {
            res += counts.getOrDefault(i, 0);
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        return res;
    }
}
