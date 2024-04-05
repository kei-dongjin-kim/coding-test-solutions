package leetcode;

public class P1614 {
    public int maxDepth(String s) {
        int len = 0;
        int max = 0;
        for (int i=0 ; i<s.length() ; i++) {
            if (s.charAt(i) == '(') {
                len++;
            } else if (s.charAt(i) == ')') {
                max = Math.max(max, len);
                len--;
            }
        }
        return max;
    }
}
