package leetcode;

import org.junit.jupiter.api.Test;

public class P2917Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 4, 8, 16};
        int k = 1;
        int expected = 31;
        P2917 solution = new P2917();
        int actual = solution.findKOr(nums, k);
        assert expected == actual;
    }
}
