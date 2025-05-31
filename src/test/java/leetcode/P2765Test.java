package leetcode;

import org.junit.jupiter.api.Test;

public class P2765Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 7, 9};
        int expected = 5;
        P2765 solution = new P2765();
        int actual = solution.alternatingSubarray(nums);
        assert expected == actual;
    }
}
