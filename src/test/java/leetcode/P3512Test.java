package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3512Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3};
        int k = 5;
        int expected = 1;
        P3512 solution = new P3512();
        int actual = solution.minOperations(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
