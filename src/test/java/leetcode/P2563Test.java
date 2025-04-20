package leetcode;

import org.junit.jupiter.api.Test;

public class P2563Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int lower = 3;
        int upper = 5;
        long expected = 4;
        P2563 solution = new P2563();
        long actual = solution.countFairPairs(nums, lower, upper);
        assert expected == actual;
    }
}
