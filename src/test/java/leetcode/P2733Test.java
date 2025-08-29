package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2733Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 1, 1, 2, 3, 4, 5};
        int expected = 2;
        P2733 solution = new P2733();
        int actual = solution.findNonMinOrMax(nums);
        Assertions.assertEquals(expected, actual);
    }
}
