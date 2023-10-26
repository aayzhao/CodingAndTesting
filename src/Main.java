import java.io.IOException;

/**
 * space for testing functions written in Solution
 */
public class Main {
    private static final int testcaseCount = 3;
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        for (int i = 1; i <= testcaseCount; i++) {
            int[] testcase = InputParser.parse1DIntArr(i);
            System.out.println(solution.numFactoredBinaryTrees(testcase));
        }
    }
}