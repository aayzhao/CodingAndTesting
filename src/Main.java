import testcaseio.*;

/**
 * space for testing functions written in Solution
 */
public class Main {
    private static final int testcaseCount = 5;
    public static void main(String[] args) {
        Solution solution = new Solution(); // initialize solution class

        try { // run the testcases
            for (int testNum = 1; testNum <= testcaseCount; testNum++) {
                InputParser.parseNum(testNum, 0);
            }
        } catch (TestcaseReadException e) {
            e.printFailedCase();
        }

//        for (int testNum = 1; testNum <= testcaseCount; testNum++) {
//            System.out.println(testcaseio.InputParser.parseNum(testNum, 0));
//        }
    }
}