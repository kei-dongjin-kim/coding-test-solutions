package leetcode;

public class P1289 {
    public int minFallingPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0] = grid[0];

        for (int i=1 ; i<rows ; i++) {
            for (int j=0 ; j<cols ; j++) {
                int submin = Integer.MAX_VALUE;
                for (int x=0 ; x<cols ; x++) {
                    if (j != x) {
                        submin = Math.min(submin, dp[i-1][x]);
                    }
                }
                dp[i][j] = grid[i][j] + submin;
            }
        }

        int min = dp[rows-1][0];
        for (int i=1 ; i<cols ; i++) {
            min = Math.min(min, dp[rows-1][i]);
        }

        return min;
    }
}
