import java.io.IOException;

/**
 * space for testing functions written in Solution
 */
public class Main {
    private static final int testcaseCount = 4;
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        for (int testNum = 1; testNum <= testcaseCount; testNum++) {
            int[] testcase = InputParser.parse1DIntArr(testNum, 1);
            System.out.println(solution.numFactoredBinaryTrees(testcase));
        }

        for (int testNum = 1; testNum <= testcaseCount; testNum++) {
            System.out.println(InputParser.parseNum(testNum, 0));
        }
    }
}