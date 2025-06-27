package leetcode;

import org.junit.jupiter.api.Test;

public class P2529Test {

    @Test
    void test1() {
        int[] nums = new int[] {-1, -1, -1, 0, 0, 0, 0, 1};
        int expected = 3;
        P2529 solution = new P2529();
        int actual = solution.maximumCount(nums);
        assert expected == actual;
    }
}
