package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0598Test {

    @Test
    void test1() {
        int m = 10;
        int n = 10;
        int[][] ops = new int[][] {{5, 5}, {7, 3}, {3, 7}};
        int expected = 9;
        P0598 solution = new P0598();
        int actual = solution.maxCount(m, n, ops);
        Assertions.assertEquals(expected, actual);
    }
}
