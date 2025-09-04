package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P3379Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, -2, 3, -4, 5};
        int[] expected = new int[] {-2, 5, 1, 5, 5};
        P3379 solution = new P3379();
        int[] actual = solution.constructTransformedArray(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}
