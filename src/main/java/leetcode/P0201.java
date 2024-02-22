package leetcode;

public class P0201 {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        // find the common prefix
        while (left < right) {
            left >>= 1;
            right >>= 1;
            ++shift;
        }
        return left << shift;
    }
}
