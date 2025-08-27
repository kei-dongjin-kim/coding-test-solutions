package leetcode;

public class P3226 {
    public int minChanges(int n, int k) {
        if (n == k) {
            return 0;
        }
        int count = 0;
        while (n != 0 || k != 0) {
            int nr = n % 2;
            int kr = k % 2;
            if (nr == kr) {
                // Do nothing.
            } else {
                if (nr == 1 && kr == 0) {
                    count++;
                } else if (nr == 0 && kr == 1) {
                    return -1;
                }
            }
            n /= 2;
            k /= 2;
        }
        return count;
    }
}
