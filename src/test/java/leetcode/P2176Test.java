package leetcode;

import org.junit.jupiter.api.Test;

public class P2176Test {

    @Test
    void test1() {
        int[] nums = {5, 5, 5};
        int k = 2;
        int expected = 3;
        P2176 solution = new P2176();
        int actual = solution.countPairs(nums, k);
        assert expected == actual;
    }
}
