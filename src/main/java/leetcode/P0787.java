package leetcode;

import java.util.Arrays;

public class P0787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int INF = 1000000;
        int[][] dp = new int[k + 2][n];
        for (int i = 0; i <= k + 1; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][src] = 0;
        for (int i = 1; i <= k + 1; i++) {
            dp[i][src] = 0;
            for (int[] flight : flights) {
                int u = flight[0], v = flight[1], w = flight[2];
                dp[i][v] = Math.min(dp[i][v], dp[i - 1][u] + w);
            }
        }
        return dp[k + 1][dst] >= INF ? -1 : dp[k + 1][dst];
    }
}
