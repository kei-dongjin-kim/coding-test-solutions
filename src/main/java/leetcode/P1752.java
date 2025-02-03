package leetcode;

public class P1752 {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (count > 0) {
                    return false;
                }
                if (nums[0] < nums[nums.length - 1]) {
                    return false;
                }
                count++;
            }
        }
        return true;
    }
}
