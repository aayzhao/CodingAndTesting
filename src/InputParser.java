import java.io.IOException;
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

    /**
     * Parses testcase file for the given test case number.
     * @param caseNum case number in file to be parsed
     * @return returns an array of int values
     * @throws IOException file was unable to be read
     */
    public static int[] parse1DIntArr(int caseNum) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        try {
            File testcases = new File(testcasePath);
            System.err.println(testcases.getAbsolutePath());
            scan = new Scanner(testcases);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line = "-1";

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            Matcher matcher = Pattern.compile("\\d+").matcher(line);
            if (!matcher.find()) throw new IOException("No line number");
            if (Integer.parseInt(matcher.group()) == caseNum) break;
        }
        scan.close();
        if (caseNum != line.charAt(0) - '0') throw new IOException("Case Number Not Found");


        Matcher matcher = Pattern.compile("\\d+").matcher(line);
        while (matcher.find()) {
            arr.add(Integer.parseInt(matcher.group()));
        }
        int[] a = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }
        return a;
    }
    //TODO: implement parse2DCharArr()
    public static char[][] parse2DCharArr() {
        return new char[1][1];
    }

}
