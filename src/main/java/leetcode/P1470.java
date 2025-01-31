package leetcode;

public class P1470 {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] result = new int[len];
        int even = 0;
        int odd = n;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                result[i] = nums[even];
                even++;
            } else {
                result[i] = nums[odd];
                odd++;
            }
        }
        return result;
    }
}
