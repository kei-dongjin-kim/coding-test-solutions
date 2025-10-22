package leetcode;

public class P2475 {
    public int unequalTriplets(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (nums[i] == nums[j]) {
                    continue;
                }
                for (int k = j + 1; k < len; k++) {
                    if (
                        nums[j] != nums[k] &&
                        nums[k] != nums[i]
                    ) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
