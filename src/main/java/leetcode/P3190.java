package leetcode;

public class P3190 {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int n : nums) {
            if (n % 3 != 0) {
                result++;
            }
        }
        return result;
    }
}
