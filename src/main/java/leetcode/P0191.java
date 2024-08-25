package leetcode;

public class P0191 {
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        while (n > 0) {
            if ((n & mask) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
