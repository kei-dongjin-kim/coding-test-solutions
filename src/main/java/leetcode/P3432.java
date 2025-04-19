package leetcode;

public class P3432 {
    public int countPartitions(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 0;
        for (int n : nums) {
            right += n;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            int diff = left - right;
            if (diff % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
