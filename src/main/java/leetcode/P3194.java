package leetcode;

import java.util.Arrays;

public class P3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        double[] avgList = new double[len / 2];
        while (left < right) {
            avgList[left] = (double) (nums[left] + nums[right]) / 2;
            left++;
            right--;
        }
        double min = Double.MAX_VALUE;
        for (double d : avgList) {
            min = Math.min(min, d);
        }
        return min;
    }
}
