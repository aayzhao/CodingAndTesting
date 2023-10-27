package problemsolutions;

/**
 * leetcode problem #137
 * O(N) time, O(N) space solved in 14:39 minutes
 * O(N) time, O(1) space solved in 20:51 minutes, with editorial help
 */
public class LC0137 {
    public int singleNumber(int[] nums) {
        int loner = 0;

        for (int shift = 0; shift < 32; shift++) {
            int bitSum = 0;

            for (int num : nums) {
                bitSum += (num >> shift) & 1;
            }
            int lonerBit = bitSum % 3;
            loner = loner | (lonerBit << shift);
        }
        return loner;
    }
}
