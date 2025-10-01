package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2670Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6 , 7, 7, 7};
        int[] expected = new int[] {-5, -3, -1, 1, 3, 5, 6, 6, 7};
        P2670 solution = new P2670();
        int[] actual = solution.distinctDifferenceArray(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}
