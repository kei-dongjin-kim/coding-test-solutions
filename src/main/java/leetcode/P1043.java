package leetcode;

public class P1043 {
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int maxSum = Integer.MIN_VALUE;
            int maxInPartition = arr[i];

            for (int j = 0; j < Math.min(k, i + 1); j++) {
                maxInPartition = Math.max(maxInPartition, arr[i - j]);
                int temp = i - j > 0 ? dp[i - j - 1] : 0;
                maxSum = Math.max(maxSum, (maxInPartition * (j + 1)) + temp);
            }
            dp[i] = maxSum;
        }
        return dp[arr.length - 1];
    }
}
