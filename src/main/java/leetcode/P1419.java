package leetcode;

public class P1419 {
    public int longestSubarray(int[] nums) {
        int maxValue = 0;
        int maxCount = 0;
        int currCount = 0;
        for (int n : nums) {
            maxValue = Math.max(maxValue, n);
        }
        for (int n : nums) {
            if (n == maxValue) {
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else {
                currCount = 0;
            }
        }
        return maxCount;
    }
}
