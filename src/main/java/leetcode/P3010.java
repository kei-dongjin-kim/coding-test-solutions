package leetcode;

import java.util.Arrays;

public class P3010 {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n - 1];
        System.arraycopy(nums, 1, arr, 0, n - 1);
        Arrays.sort(arr);
        return nums[0] + arr[0] + arr[1];
    }
}
