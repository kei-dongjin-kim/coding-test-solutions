package leetcode;

public class P1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int width = 101;
        int[] bucket = new int[width];
        for (int i = 0; i < len; i++) {
            bucket[nums[i]]++;
        }
        for (int i = 1; i < width; i++) {
            bucket[i] += bucket[i - 1];
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = bucket[nums[i] - 1];
            }
        }
        return ans;
    }
}
