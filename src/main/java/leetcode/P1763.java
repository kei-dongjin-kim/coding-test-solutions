package leetcode;

public class P1763 {
    public String longestNiceSubstring(String s) {
        String nice = "";
        for (int i = 0; i < s.length(); i++) {
            int[] upper = new int[26];
            int[] lower = new int[26];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                int u_idx = c - 'A';
                if (0 <= u_idx && u_idx <= 26) {
                    upper[u_idx]++;
                } else {
                    int ccc = c - 'a';
                    lower[c - 'a']++;
                }
                if (isNicePair(upper, lower)) {
                    if (nice.length() < j - i + 1) {
                        nice = s.substring(i, j + 1);
                    }
                }
            }
        }
        return nice;
    }
    private boolean isNicePair(int[] upper, int[] lower) {
        for (int i = 0; i < upper.length; i++) {
            if (upper[i] != 0 || lower[i] != 0) {
                if (upper[i] == 0 || lower[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
