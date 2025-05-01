package leetcode;

import java.util.Arrays;

public class P1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = - nums[i];
                k--;
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        k = k % 2;
        if (k == 1) {
            nums[0] = - nums[0];
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }
}
