package leetcode;

import org.junit.jupiter.api.Test;

public class P3065Test {

    @Test
    void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        int expected = 4;
        P3065 solution = new P3065();
        int actual = solution.minOperations(nums, k);
        assert expected == actual;
    }
}
