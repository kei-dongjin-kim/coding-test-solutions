package leetcode;

public class P0279 {

// --------------------------------------------------------------
//     1 - Recursion
// --------------------------------------------------------------
//     public int numSquares(int n) {
//         if (n <= 0) return 0;
//         int result = n;
//         for (int i=1 ; i*i <= n ; i++) {
//             int square = i * i;
//             result = Math.min(result, 1 + numSquares(n - square));
//         }
//         return result;
//     }

// --------------------------------------------------------------
//     2 - Top down, DP
// --------------------------------------------------------------
//    int[] dp;
//    int solve(int n) {
//        if (n <= 0) return 0;
//        if (dp[n] != -1) return dp[n];
//        int result = n;
//        for (int i=1 ; i*i <= n ; i++) {
//            int square = i * i;
//            result = Math.min(result, 1 + solve(n - square));
//        }
//        return dp[n] = result;
//    }
//    public int numSquares(int n) {
//        dp = new int[n + 1];
//        for (int i=0 ; i<dp.length ; i++) {
//            dp[i] = -1;
//        }
//        return solve(n);
//    }

// --------------------------------------------------------------
//    3 - Bottom up, DP
// --------------------------------------------------------------
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }
        return dp[n];
    }
}
