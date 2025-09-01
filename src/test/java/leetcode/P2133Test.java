package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2133Test {

    @Test
    void test1() {
        int[][] matrix = new int[][] {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        boolean expected = true;
        P2133 solution = new P2133();
        boolean actual = solution.checkValid(matrix);
        Assertions.assertEquals(expected, actual);
    }
}
