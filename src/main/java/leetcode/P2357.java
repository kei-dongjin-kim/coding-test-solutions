package leetcode;

import java.util.Arrays;

public class P2357 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                if (num > max) {
                    max = num;
                    count++;
                }
            }
        }
        return count;
    }
}
