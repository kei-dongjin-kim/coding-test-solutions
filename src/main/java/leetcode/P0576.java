package leetcode;

import java.util.Arrays;

public class P0576 {
    final int MOD = 1_000_000_007;

    private int finding(int m, int n, int maxMove, int r, int c, int[][][] dp) {
        if (r<0 || c<0 || r>=m || c>=n) return 1;
        if (maxMove == 0) return 0;

        if (dp[r][c][maxMove] >= 0) return dp[r][c][maxMove];

        int up = finding(m, n, maxMove-1, r-1, c, dp);
        int down = finding(m, n, maxMove-1, r+1, c, dp);
        int left = finding(m, n, maxMove-1, r, c-1, dp);
        int right = finding(m, n, maxMove-1, r, c+1, dp);

        return dp[r][c][maxMove] = ((up+down)%MOD+(left+right)%MOD)%MOD;
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for (int[][] d1 : dp)
            for (int[] d2 : d1)
                Arrays.fill(d2, -1);
        return finding(m, n, maxMove, startRow, startColumn, dp);
    }
}
