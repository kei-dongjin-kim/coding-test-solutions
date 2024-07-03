package leetcode;

import java.util.Arrays;

public class P1509 {
    public int minDifference(int[] nums) {
        int len = nums.length;
        if (len <= 4) return 0;

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<4 ; i++) {
            min = Math.min(min, nums[len - 4 + i] - nums[i]);
        }

        return min;
    }
}
