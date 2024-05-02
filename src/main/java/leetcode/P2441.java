package leetcode;

import java.util.Arrays;

public class P2441 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int absLeft = Math.abs(nums[left]);
            int absRight = Math.abs(nums[right]);
            if ((nums[left] + nums[right] == 0) && absLeft == absRight) {
                return absLeft;
            } else if (absLeft > absRight) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}
