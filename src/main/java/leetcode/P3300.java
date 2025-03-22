package leetcode;

public class P3300 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            nums[i] = 0;
            while (n > 0) {
                nums[i] += n % 10;
                n /= 10;
            }
        }
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
