package leetcode;

import java.util.Arrays;

public class P0945 {
    public int minIncrementForUnique(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i=1 ; i<nums.length ; i++) {
            if (nums[i-1] >= nums[i]) {
                int increment = nums[i-1] - nums[i] + 1;
                count += increment;

                nums[i] = nums[i-1] + 1;
            }
        }
        return count;
    }
}
