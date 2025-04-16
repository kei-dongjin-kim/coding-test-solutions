package leetcode;

public class P3461 {
    public boolean hasSameDigits(String s) {
        int len = s.length();
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            num[i] = s.charAt(i) - '0';
        }
        while (len > 2) {
            for (int i = 0; i < len - 1; i++) {
                num[i] = (num[i] + num[i + 1]) % 10;
            }
            len--;
        }
        return num[0] == num[1];
    }
}
