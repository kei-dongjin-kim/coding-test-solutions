package leetcode;

import org.junit.jupiter.api.Test;

public class P3232Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4, 11};
        boolean expected = true;
        P3232 solution = new P3232();
        boolean actual = solution.canAliceWin(nums);
        assert expected == actual;
    }
}
