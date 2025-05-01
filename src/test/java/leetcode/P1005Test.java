package leetcode;

import org.junit.jupiter.api.Test;

public class P1005Test {

    @Test
    void test1() {
        int[] nums = new int[] {-1, 1, 2, 3};
        int k = 4;
        int expected = 5;
        P1005 solution = new P1005();
        int actual = solution.largestSumAfterKNegations(nums, k);
        assert expected == actual;
    }
}
