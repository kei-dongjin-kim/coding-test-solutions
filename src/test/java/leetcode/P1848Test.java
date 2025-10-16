package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1848Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int start = 0;
        int expected = 5;
        P1848 solution = new P1848();
        int actual = solution.getMinDistance(nums, target, start);
        Assertions.assertEquals(expected, actual);
    }
}
