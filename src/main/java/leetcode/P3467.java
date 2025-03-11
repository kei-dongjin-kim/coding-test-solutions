package leetcode;

import java.util.Arrays;

public class P3467 {
    public int[] transformArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int even = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                even++;
            }
        }
        for (int i = even; i < len; i++) {
            result[i] = 1;
        }
        return result;
    }
}
