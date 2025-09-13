package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3142Test {

    @Test
    void test1() {
        int[][] grid = new int[][] {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        boolean expected = true;
        P3142 solution = new P3142();
        boolean actual = solution.satisfiesConditions(grid);
        Assertions.assertEquals(expected, actual);
    }
}
