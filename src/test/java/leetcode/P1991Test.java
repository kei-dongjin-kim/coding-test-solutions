package leetcode;

import org.junit.jupiter.api.Test;

public class P1991Test {

    @Test
    void test1() {
        int[] nums = new int[] {-1, 4, -3, 9, -2, 2};
        int expected = 3;
        P1991 solution = new P1991();
        int actual = solution.findMiddleIndex(nums);
        assert expected == actual;
    }
}
