package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1289Test {

    @Test
    @DisplayName("grid = [[1,2,3],[4,5,6],[7,8,9]]")
    void test1() {
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int expected = 13;
        int actual = new P1289().minFallingPathSum(grid);
        assert expected == actual;
    }
}
