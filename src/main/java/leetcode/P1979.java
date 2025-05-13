package leetcode;

import java.util.Arrays;

public class P1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int left = nums[0];
        int right = nums[nums.length - 1];
        for (int i = nums[0]; i > 0; i--) {
            if (left % i == 0 && right % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
