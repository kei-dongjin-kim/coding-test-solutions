package leetcode;

import org.junit.jupiter.api.Test;

public class P1995Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int expected = 2;
        P1995 solution = new P1995();
        int actual = solution.countQuadruplets(nums);
        assert expected == actual;
    }
}
