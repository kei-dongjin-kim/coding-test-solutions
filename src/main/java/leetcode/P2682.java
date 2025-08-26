package leetcode;

public class P2682 {
    public int[] circularGameLosers(int n, int k) {
        if (n == 1 && k == 1) {
            return new int[0];
        }
        int[] freq = new int[n + 1];
        int curr = 1;
        int count = 0;
        while (freq[curr] == 0) {
            freq[curr]++;
            count++;
            curr += (k * count);
            curr %= n;
            if (curr == 0) {
                curr = n;
            }
        }
        int[] res = new int[n - count];
        int idx = 0;
        for (int i = 1; i < n + 1; i++) {
            if (freq[i] == 0) {
                res[idx] = i;
                idx++;
            }
        }
        return res;
    }
}
