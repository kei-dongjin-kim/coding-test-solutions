package leetcode;

public class P2496 {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            if (isDigit(s)) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }
    private boolean isDigit(String str) {
        for (char c : str.toCharArray()) {
            int ci = c - '0';
            if (ci < 0 || 9 < ci) {
                return false;
            }
        }
        return true;
    }
}
