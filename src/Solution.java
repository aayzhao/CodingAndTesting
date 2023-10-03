import java.util.*;

/**
 * space for putting solutions
 */
class Solution {
    public boolean winnerOfGame(String colors) {
        int aCnt=0,bCnt=0;
        int aTemp=0,bTemp=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                bTemp=0;
                aTemp++;
                if(aTemp>=3){
                    aCnt++;
                }
            }
            else{
                aTemp=0;
                bTemp++;
                if(bTemp>=3){
                    bCnt++;
                }
            }
        }
        return aCnt > bCnt;
    }
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