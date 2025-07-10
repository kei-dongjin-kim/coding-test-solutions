package leetcode;

import org.junit.jupiter.api.Test;

public class P1582Test {

    @Test
    void test1() {
        int[][] mat = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 1;
        P1582 solution = new P1582();
        int actual = solution.numSpecial(mat);
        assert expected == actual;
    }
}
