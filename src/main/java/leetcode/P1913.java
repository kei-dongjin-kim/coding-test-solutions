package leetcode;

import java.util.Arrays;

public class P1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 1] * nums[len - 2]) - (nums[1] * nums[0]);
    }
}
