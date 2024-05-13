package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0861Test {

    @Test
    @DisplayName("grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]")
    void test1() {
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int expected = 39;
        int actual = new P0861().matrixScore(grid);
        assert actual == expected;
    }
}
