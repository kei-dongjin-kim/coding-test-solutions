package leetcode;

public class P0476 {
    public int findComplement(int num) {
        int mask = 1;
        // Find the mask that has the same number of bits as num and all bits are 1
        while (mask < num) {
            mask = (mask << 1) + 1;
        }
        return num ^ mask;
    }
}
