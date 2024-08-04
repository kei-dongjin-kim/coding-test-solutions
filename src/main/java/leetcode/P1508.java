package leetcode;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

public class P1508 {

    private static final int MOD = 1_000_000_007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        long result = (sumOfFirstK(nums, n, right) - sumOfFirstK(nums, n, left - 1)) % MOD;
        return (int) ((result + MOD) % MOD);
    }

    private Map.Entry<Integer, Long> countAndSum(
            int[] nums,
            int n,
            int target
    ) {
        int count = 0;
        long currentSum = 0;
        long totalSum = 0;
        long windowSum = 0;

        for (int j=0, i=0 ; j<n ; ++j) {
            currentSum += nums[j];
            windowSum += nums[j] * (j - i + 1);
            while (currentSum > target) {
                windowSum -= currentSum;
                currentSum -= nums[i++];
            }
            count += j - i + 1;
            totalSum += windowSum;
        }

        return new AbstractMap.SimpleEntry<>(count, totalSum);
    }

    private long sumOfFirstK(int[] nums, int n, int k) {
        int minSum = Arrays.stream(nums).min().getAsInt();
        int maxSum = Arrays.stream(nums).sum();
        int left = minSum, right = maxSum;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (countAndSum(nums, n,mid).getKey() >= k) right = mid - 1;
            else left = mid + 1;
        }

        Map.Entry<Integer, Long> result = countAndSum(nums, n, left);

        return result.getValue() - (long) left * (result.getKey() - k);
    }
}
