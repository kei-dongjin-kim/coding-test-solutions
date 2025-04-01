package leetcode;

import org.junit.jupiter.api.Test;

public class P1572Test {

    @Test
    void test1() {
        int[][] mat = new int[][] {{1, 2, 1}, {2, 1, 2}, {1, 2, 1}};
        int expected = 5;
        P1572 solution = new P1572();
        int actual = solution.diagonalSum(mat);
        assert expected == actual;
    }
}
