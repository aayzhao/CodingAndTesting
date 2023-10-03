package ProblemSolutions;

/**
 * leetcode problem #2038
 * solved in 11:38
 */
public class LC2038 {
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
    public boolean winnerOfGame1(String colors) {
        int a = 0;
        int b = 0;
        char cur = colors.charAt(0);
        int cur_count = 1;
        for (int i = 1; i <= colors.length(); i++) {
            if (i == colors.length()) {
                if (cur == 'A') a += Math.max(cur_count - 2, 0);
                else b += Math.max(cur_count - 2, 0);
            }
            else if (cur != colors.charAt(i)) {
                if (cur == 'A') a += Math.max(cur_count - 2, 0);
                else b += Math.max(cur_count - 2, 0);
                cur = colors.charAt(i);
                cur_count = 1;
            } else {
                cur_count++;
            }
        }
        return a > b;
    }
}
