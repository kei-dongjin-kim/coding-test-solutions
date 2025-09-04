package leetcode;

public class P3379 {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int curr = (i + nums[i]) % len;
            if (nums[i] > 0) {
                result[i] = nums[curr];
            } else if (nums[i] < 0)  {
                if (curr < 0) {
                    curr += len;
                }
                result[i] = nums[curr];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
