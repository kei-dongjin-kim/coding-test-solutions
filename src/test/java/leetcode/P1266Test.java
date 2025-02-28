package leetcode;

import org.junit.jupiter.api.Test;

public class P1266Test {

    @Test
    void test1() {
        int[][] points = new int[][] {{0, 0}, {2, 1}, {2, 2}};
        int expected = 3;
        P1266 solution = new P1266();
        int actual = solution.minTimeToVisitAllPoints(points);
        assert expected == actual;
    }
}
