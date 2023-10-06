import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * space for testing functions written in Solution
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Solution solution = new Solution();

        System.out.println(solution.minimizeMax(InputParser.parse1DIntArr(1), 3));
        System.out.println(solution.minimizeMax(InputParser.parse1DIntArr(2), 1));
        System.out.println(solution.minimizeMax(InputParser.parse1DIntArr(3), 2));
        System.out.println(solution.minimizeMax(InputParser.parse1DIntArr(4), 5));
//        System.out.println(solution.winnerOfGame("AA"));
//        System.out.println(solution.winnerOfGame("ABBBBBBBAAA"));
//        System.out.println(solution.winnerOfGame("AAAABBBB"));

//        System.out.println(solution.isHappy(234));
//        System.out.println(solution.isHappy(19));
//        System.out.println(solution.isHappy(10));
//        System.out.println(solution.isHappy(1000));
    }
}