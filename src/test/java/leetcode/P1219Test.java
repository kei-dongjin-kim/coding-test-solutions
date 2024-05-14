package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1219Test {

    @Test
    @DisplayName("grid = [[0,6,0],[5,8,7],[0,9,0]]")
    void test1() {
        int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
        int expected = 24;
        int actual = new P1219().getMaximumGold(grid);
        assert actual == expected;
    }

}
