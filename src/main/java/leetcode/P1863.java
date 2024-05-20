package leetcode;

public class P1863 {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        // 1 << n is 2^n
        for (int i = 0; i < (1 << n); i++) {
            int xor = 0;
            for (int j = 0; j < n; j++) {
                // if jth bit is set in i
                if ((i & (1 << j)) > 0) {
                    xor ^= nums[j];
                }
            }
            sum += xor;
        }
        return sum;
    }
}
