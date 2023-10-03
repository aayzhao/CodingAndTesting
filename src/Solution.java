import java.util.*;

/**
 * space for putting solutions
 */
class Solution {
    public boolean isHappy(int n) { // leetcode #0202
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