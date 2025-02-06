package leetcode;

public class P1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int diffCount = 0;
        char[] diff1 = new char[2];
        char[] diff2 = new char[2];
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount >= 2) {
                    return false;
                }
                diff1[diffCount] = s1.charAt(i);
                diff2[diffCount] = s2.charAt(i);
                diffCount++;
            }
        }
        if (diffCount == 1) {
            return false;
        }
        return diff1[0] == diff2[1] && diff1[1] == diff2[0];
    }
}
