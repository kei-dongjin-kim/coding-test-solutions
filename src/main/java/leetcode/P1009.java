package leetcode;

public class P1009 {
    public int bitwiseComplement(int n) {
        int mask = 1;
        // Find the mask that has the same number of bits as n
        while (mask < n) {
            mask = (mask << 1) + 1;
        }
        return n ^ mask;
    }
}
