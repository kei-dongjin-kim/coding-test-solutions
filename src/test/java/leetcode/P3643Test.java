package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3643Test {

    @Test
    void test1() {
        int[][] grid = new int[][]{
            { 1,  2,  3,  4,  5},
            { 6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
        };
        int x = 1;
        int y = 1;
        int k = 3;
        int[][] expected = new int[][]{
            { 1,  2,  3,  4,  5},
            { 6, 17, 18, 19, 10},
            {11, 12, 13, 14, 15},
            {16,  7,  8,  9, 20},
            {21, 22, 23, 24, 25},
        };
        P3643 solution = new P3643();
        int[][] actual = solution.reverseSubmatrix(grid, x, y, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
