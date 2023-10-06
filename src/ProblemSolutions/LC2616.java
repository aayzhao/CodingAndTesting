package ProblemSolutions;

import java.util.Arrays;

public class LC2616 {
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
}
