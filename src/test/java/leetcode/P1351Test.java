package leetcode;

import org.junit.jupiter.api.Test;

public class P1351Test {

    @Test
    void test1() {
        int[][] grid = new int[][] {{1, 2, -3}, {4, -5, 6}, {-7, 8, 9}};
        int expected = 3;
        P1351 solution = new P1351();
        int actual = solution.countNegatives(grid);
        assert expected == actual;
    }
}
