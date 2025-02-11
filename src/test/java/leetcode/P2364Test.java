package leetcode;

import org.junit.jupiter.api.Test;

public class P2364Test {

    @Test
    void test1() {
        int[] nums = new int[]{5, 4, 3, 2, 1};
        long expected = 10L;
        P2364 solution = new P2364();
        long actual = solution.countBadPairs(nums);
        assert expected == actual;
    }
}
