package leetcode;

public class P0260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int mask = 1;
        // The while statement below finds the rightmost bit
        // that is different between two numbers in an array, which appear only once.
        // This bit is used to separate the numbers into two groups and find the unique numbers.
        while ((xor & mask) == 0) {
            mask <<= 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[] {a, b};
    }
}
