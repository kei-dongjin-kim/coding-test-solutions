package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0976Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int expected = 12;
        P0976 solution = new P0976();
        int actual = solution.largestPerimeter(nums);
        Assertions.assertEquals(expected, actual);
    }
}
