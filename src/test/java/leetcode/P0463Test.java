package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0463Test {

    @Test
    @DisplayName("grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]")
    void test1() {
        int[][] grid = {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };
        int expected = 16;
        assert new P0463().islandPerimeter(grid) == expected;
    }
}
