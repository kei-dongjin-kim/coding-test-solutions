package leetcode;

public class P2293 {
    public int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int len = nums.length / 2;
            int[] newNums = new int[len];
            for (int i = 0; i < len; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newNums;
        }
        return nums[0];
    }
}
