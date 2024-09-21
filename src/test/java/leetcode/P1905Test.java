package leetcode;

import org.junit.jupiter.api.Test;

public class P1905Test {

    @Test
    void test1() {
        int[][] grid1 = {
            {0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 1, 1}
        };
        int[][] grid2 = {
            {0, 1, 1, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0}
        };
        int expected = 3;
        int actual = new P1905().countSubIslands(grid1, grid2);
        assert expected == actual;
    }
}
