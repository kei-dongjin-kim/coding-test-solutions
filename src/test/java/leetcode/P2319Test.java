package leetcode;

import org.junit.jupiter.api.Test;

public class P2319Test {

    @Test
    void test1() {
        int[][] grid = new int[][] {{1, 0, 1},{0, 1, 0},{1, 0, 1}};
        boolean expected = true;
        P2319 solution = new P2319();
        boolean actual = solution.checkXMatrix(grid);
        assert expected == actual;
    }
}
