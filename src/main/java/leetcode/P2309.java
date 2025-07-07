package leetcode;

public class P2309 {
    public String greatestLetter(String s) {
        boolean[] u = new boolean[26];
        boolean[] l = new boolean[26];
        for (char c : s.toCharArray()) {
            if (c - 'a' < 0) {
                u[c - 'A'] = true;
            } else {
                l[c - 'a'] = true;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (u[i] && l[i]) {
                char tmp = (char) ('A' + i);
                return tmp + "";
            }
        }
        return "";
    }
}
