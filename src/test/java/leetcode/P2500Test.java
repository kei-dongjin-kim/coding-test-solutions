package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2500Test {

    @Test
    @DisplayName("grid = [[1,2,4],[3,3,1]]")
    void deleteGreatestValue_Test1() {
        int[][] grid = {{1, 2, 4}, {3, 3, 1}};
        int expected = 8;
        int actual = new P2500().deleteGreatestValue(grid);
        assert expected == actual;
    }
}
