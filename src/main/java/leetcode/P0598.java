package leetcode;

public class P0598 {
    public int maxCount(int m, int n, int[][] ops) {
        int min_r = m;
        int min_c = n;
        for (int[] i : ops) {
            min_r = Math.min(min_r, i[0]);
            min_c = Math.min(min_c, i[1]);
        }
        return min_r * min_c;
    }
}
