package leetcode;

public class P3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min_idx = 0;
            int min_val = nums[0];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < min_val) {
                    min_idx = j;
                    min_val = nums[j];
                }
            }
            nums[min_idx] = min_val * multiplier;
        }
        return nums;
    }
}
