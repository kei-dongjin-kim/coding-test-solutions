package leetcode;

import org.junit.jupiter.api.Test;

public class P0674Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int expected = 5;
        P0674 solution = new P0674();
        int actual = solution.findLengthOfLCIS(nums);
        assert expected == actual;
    }
}
