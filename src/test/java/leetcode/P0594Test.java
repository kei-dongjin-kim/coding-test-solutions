package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0594Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 3 ,3 ,3};
        int expected = 5;
        P0594 solution = new P0594();
        int actual = solution.findLHS(nums);
        Assertions.assertEquals(expected, actual);
    }
}
