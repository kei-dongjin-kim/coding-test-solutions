package leetcode;

public class P1704 {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int a = 0;
        int b = 0;
        for (int i = 0; i < len; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                if (i < len / 2) {
                    a++;
                } else {
                    b++;
                }
            }
        }
        return a == b;
    }
}
