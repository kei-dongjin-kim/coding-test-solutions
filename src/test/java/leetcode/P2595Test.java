package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2595Test {

    @Test
    void test1() {
        int n = 8;
        int[] expected = new int[] {0, 1};
        P2595 solution = new P2595();
        int[] actual = solution.evenOddBit(n);
        Assertions.assertArrayEquals(expected, actual);
    }
}
