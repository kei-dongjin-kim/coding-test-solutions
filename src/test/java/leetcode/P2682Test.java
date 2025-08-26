package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2682Test {

    @Test
    void test1() {
        int n = 10;
        int k = 1;
        int[] expected = new int[] {3, 5, 6, 8, 9, 10};
        P2682 solution = new P2682();
        int[] actual = solution.circularGameLosers(n, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
