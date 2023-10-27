package testcaseio;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Static methods for parsing input from testcase files.
 * @author aayzhao
 */
public class InputParser {
    static final String testcasePath = "src/testcases.txt";
    static boolean debug = false;

    /**
     * Parses testcase file for the given test case number.
     * @param caseNum   case number in file to be parsed
     * @param offset    which "column" to parse each line from
     * @return returns an array of int values
     * @throws TestcaseReadException file was unable to be read properly, or is malformed
     */
    public static int[] parse1DIntArr(int caseNum, int offset) throws TestcaseReadException {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        try {
            File testcases = new File(testcasePath);
            if (debug) System.err.println(testcases.getAbsolutePath());
            scan = new Scanner(testcases);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new TestcaseReadException("Failed To Find Testcase File", e, caseNum);
        }
        String line = "-1";

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            Matcher matcher = Pattern.compile("\\d+").matcher(line);
            if (matcher.find() && Integer.parseInt(matcher.group()) == caseNum) break;
        }
        scan.close();
        Matcher matcher = Pattern.compile("\\d+").matcher(line);

        if (!matcher.find() || caseNum != Integer.parseInt(matcher.group())) throw new TestcaseReadException("Case Number Not Found", caseNum);

        while (matcher.find()) {
            arr.add(Integer.parseInt(matcher.group()));
        }
        int[] a = new int[arr.size() - offset];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(i + offset);
        }
        return a;
    }

    /**
     * Parses testcase file for a single int per line of testcase input
     * @param caseNum   which testcase to parse file for
     * @param offset    which "column" of input to parse
     * @return int for the testcase
     * @throws TestcaseReadException thrown if failed to read file, or file is malformed
     */
    public static int parseNum(int caseNum, int offset) throws TestcaseReadException {
        offset++;
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        try {
            File testcases = new File(testcasePath);
            if (debug) System.err.println(testcases.getAbsolutePath());
            scan = new Scanner(testcases);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new TestcaseReadException("Failed To Find Testcase File", e, caseNum);
        }
        String line = "-1";

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            Matcher matcher = Pattern.compile("\\d+").matcher(line);
            if (matcher.find() && Integer.parseInt(matcher.group()) == caseNum) break;
        }
        scan.close();
        Matcher matcher = Pattern.compile("\\d+").matcher(line);
        if (!matcher.find() || caseNum != Integer.parseInt(matcher.group())) throw new TestcaseReadException("Case Number Not Found", caseNum);
        for (int i = 0; i < offset; i++) {
            if (!matcher.find()) throw new TestcaseReadException("Case Missing After Number And Offset", caseNum);
        }
        return Integer.parseInt(matcher.group());
    }

    //TODO: implement parse2DCharArr()
    public static char[][] parse2DCharArr() {
        return new char[1][1];
    }

}
