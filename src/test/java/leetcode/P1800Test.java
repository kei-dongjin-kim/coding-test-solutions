package leetcode;

import org.junit.jupiter.api.Test;

public class P1800Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 1, 2, 3, 4};
        int expected = 10;
        P1800 solution = new P1800();
        int actual = solution.maxAscendingSum(nums);
        assert expected == actual;
    }
}
