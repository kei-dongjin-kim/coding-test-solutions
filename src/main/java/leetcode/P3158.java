package leetcode;

public class P3158 {
    public int duplicateNumbersXOR(int[] nums) {
        int[] map = new int[51];
        int result = 0;
        for (int n : nums) {
            if (map[n] > 0) {
                result ^= n;
            }
            map[n]++;
        }
        return result;
    }
}
