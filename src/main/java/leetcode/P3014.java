package leetcode;

public class P3014 {
    public int minimumPushes(String word) {
        int len = word.length();
        int n = len;
        int res = 0;
        for (int i = 1; i <= (len / 8) + 1; i++) {
            int curr = 0;
            if (n - 8 >= 0) {
                curr = 8;
                n -= 8;
            } else {
                curr = n;
                n = 0;
            }
            res += (curr * i);
        }
        return res;
    }
}
