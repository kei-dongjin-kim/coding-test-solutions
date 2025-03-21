package leetcode;

import org.junit.jupiter.api.Test;

public class P2367Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int diff = 3;
        int expected = 2;
        P2367 solution = new P2367();
        int actual = solution.arithmeticTriplets(nums, diff);
        assert expected == actual;
    }
}
