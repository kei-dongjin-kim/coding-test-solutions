package leetcode;

import java.util.Arrays;

public class P2154 {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int n : nums) {
            if (original < n) {
                break;
            } else if (original == n) {
                original = 2 * original;
            }
        }
        return original;
    }
}
