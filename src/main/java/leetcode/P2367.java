package leetcode;

public class P2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < len; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
