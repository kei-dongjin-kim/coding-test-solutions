package leetcode;

import org.junit.jupiter.api.Test;

public class P1752Test {

    @Test
    void test1() {
        int[] nums = new int[] {3, 4, 5, 1, 2, 3};
        boolean expected = true;
        P1752 solution = new P1752();
        boolean actual = solution.check(nums);
        assert expected == actual;
    }
}
