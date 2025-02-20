package leetcode;

public class P3065 {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int n : nums) {
            if (n < k) {
                count++;
            }
        }
        return count;
    }
}
