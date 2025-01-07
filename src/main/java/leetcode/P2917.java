package leetcode;

public class P2917 {
    public int findKOr(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < 31; i++) {
            int sum = 0;
            for (int j : nums) {
                sum += (j >> i & 1);
            }
            if (sum >= k) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
