package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2164Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {1, 4, 3, 2, 5};
        P2164 solution = new P2164();
        int[] actual = solution.sortEvenOdd(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}
