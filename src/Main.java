import testcaseio.*;
import problemsolutions.*;

/**
 * space for testing functions written in Solution
 */
public class Main {
    private static final int testcaseCount = 5;
    public static void main(String[] args) {
        Solution solution = new Solution(); // initialize solution class
        LC0343 sol = new LC0343();

        try { // run the testcases
            for (int testNum = 1; testNum <= testcaseCount; testNum++) {
                System.out.println(sol.integerBreak(InputParser.parseNum(testNum, 0)));
            }
        } catch (TestcaseReadException e) {
            e.printStackTrace();
            e.printFailedCase();
        }

//        for (int testNum = 1; testNum <= testcaseCount; testNum++) {
//            System.out.println(testcaseio.InputParser.parseNum(testNum, 0));
//        }
    }
}