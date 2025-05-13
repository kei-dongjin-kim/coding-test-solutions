package leetcode;

import org.junit.jupiter.api.Test;

public class P1979Test {

    @Test
    void test1() {
        int[] nums = new int[] {3, 4, 5, 6, 10, 15};
        int expected = 3;
        P1979 solution = new P1979();
        int actual = solution.findGCD(nums);
        assert expected == actual;
    }
}
