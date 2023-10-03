package ProblemSolutions;

import java.util.HashSet;

/**
 * leetcode problem #0202
 * finished in 3:48
 */
public class LC0202 {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        HashSet<Integer> seen = new HashSet<>();
        int x = n;
        while (x != 1) {
            int next = 0;
            while (x > 0) {
                int digit = x % 10;
                next += digit * digit;
                x /= 10;
            }
            if (!seen.add(next)) return false;
            x = next;
        }

        return true;
    }
}
