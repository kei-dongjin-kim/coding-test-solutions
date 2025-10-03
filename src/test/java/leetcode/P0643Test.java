package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0643Test {

    @Test
    void test1() {
        int[] nums =  new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int k = 2;
        double expected = 4.5d;
        P0643 solution = new P0643();
        double actual = solution.findMaxAverage(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
