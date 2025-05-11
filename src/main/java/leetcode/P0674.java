package leetcode;

public class P0674 {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 1;
            }
        }
        max = Math.max(max, curr);
        return max;
    }
}
