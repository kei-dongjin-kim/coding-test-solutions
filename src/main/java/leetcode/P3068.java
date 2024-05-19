package leetcode;

public class P3068 {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int len = nums.length;
        // Initialize the dp array. dp[i][j] stores the maximum sum considering up to the i-th node, where j is even.
        long[][] dp = new long[len+1][2];
        // Initialize the last element of the dp array
        dp[len][1] = 0;
        dp[len][0] = Integer.MIN_VALUE;

        for (int index=len-1 ; index >= 0 ; index--) {
            for (int isEven=0 ; isEven<=1 ; isEven++) {
                // First case: add the value of the current element XOR k
                long case1 = dp[index+1][isEven ^ 1] + (nums[index] ^ k);
                // Second case: add the value of the current element as it is
                long case2 = dp[index+1][isEven] + nums[index];

                dp[index][isEven] = Math.max(case1, case2);
            }
        }

        return dp[0][1];
    }
}