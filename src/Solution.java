import java.util.*;

/**
 * space for putting solutions
 */
class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if (arr.length == 1) return arr.length;
        int treeCount = 0;

        for (int i : arr) {
            treeCount += 1 + findFactorPairs(arr, i);
        }

        return treeCount;
    }

    private int findFactorPairs(int[] arr, int target) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) count++;
            if (target % i == 0) {
                set.add(target / i);
                if (target / i == i) count++;
            }
        }

        return count;
    }
}