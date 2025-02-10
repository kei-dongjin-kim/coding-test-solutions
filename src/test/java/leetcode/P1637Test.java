package leetcode;

import org.junit.jupiter.api.Test;

public class P1637Test {

    @Test
    void test1() {
        int[][] points = new int[][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int expected = 2;
        P1637 solution = new P1637();
        int actual = solution.maxWidthOfVerticalArea(points);
        assert expected == actual;
    }
}
