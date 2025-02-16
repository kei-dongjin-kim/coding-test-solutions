package leetcode;

public class P1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int rc = 0;
        int lc = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                lc++;
            } else if (c == 'R') {
                rc++;
            }
            if (rc != 0 && lc == rc) {
                count++;
                lc = 0;
                rc = 0;
            }
        }
        return count;
    }
}
