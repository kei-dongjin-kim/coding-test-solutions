package leetcode;

public class P2370 {
    public int longestIdealString(String s, int k) {
        int len = s.length();
        int[] dp = new int[26];
        int res = 0;
        for (int i=0 ; i<len ; i++) {
            int curr = s.charAt(i) - 'a';
            int best = 0;
            for (int prev=0 ; prev<26 ; prev++) {
                if (Math.abs(prev - curr) <= k) {
                    best = Math.max(best, dp[prev]);
                }
            }
            dp[curr] = Math.max(dp[curr], best+1);
            res = Math.max(res, dp[curr]);
        }
        return res;
    }
}
