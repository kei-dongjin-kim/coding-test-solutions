package leetcode;

public class P2765 {
    public int alternatingSubarray(int[] nums) {
        int len = nums.length;
        int count = -1;
        int max = -1;
        for (int i = 1; i < len; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                count = 2;
                boolean increasing = false;
                for (int j = i + 1; j < len; j++) {
                    if (increasing) {
                        if (nums[j] - nums[j - 1] == 1) {
                            count++;
                        } else {
                            break;
                        }
                    } else {
                        if (nums[j - 1] - nums[j] == 1) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    increasing = !increasing;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
