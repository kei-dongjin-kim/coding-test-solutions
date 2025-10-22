package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2475Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 2, 3, 4, 5};
        int expected = 16;
        P2475 solution = new P2475();
        int actual = solution.unequalTriplets(nums);
        Assertions.assertEquals(expected, actual);
    }
}
