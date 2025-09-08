package leetcode;

public class P2980 {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}
