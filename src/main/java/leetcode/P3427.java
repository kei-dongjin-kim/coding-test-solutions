package leetcode;

public class P3427 {
    public int subarraySum(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }
}
