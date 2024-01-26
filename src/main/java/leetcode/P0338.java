package leetcode;

public class P0338 {
    public int[] countBits(int n) {

        int[] result = new int[n+1];

        for (int i=0 ; i<=n ; i++) {
            result[i] = countNumber1(i);
        }

        return result;
    }

    private int countNumber1(int p) {
        int count = 0;
        while (p > 0) {
            count += p & 1;
            p >>= 1;
        }
        return count;
    }
}
