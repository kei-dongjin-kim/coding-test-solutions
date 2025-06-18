package leetcode;

public class P2996 {
    public int missingInteger(int[] nums) {
        int len = nums.length;
        int sum = nums[0];
        int end = 0;
        boolean[] map = new boolean[52];
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                end = i - 1;
                break;
            }
        }
        for (int i = end; i < len; i++) {
            map[nums[i]] = true;
        }
        for (int i = sum; i < 52; i++) {
            if (!map[i]) {
                return i;
            }
        }
        return sum;
    }
}
