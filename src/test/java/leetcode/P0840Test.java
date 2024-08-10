package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0840Test {

    @Test
    @DisplayName("grid = [[4,3,8,11],[9,5,1,12],[2,7,6,13]]")
    void test1() {
        int[][] grid = {
            {4, 3, 8, 11},
            {9, 5, 1, 12},
            {2, 7, 6, 13}
        };
        assert new P0840().numMagicSquaresInside(grid) == 1;
    }
}
