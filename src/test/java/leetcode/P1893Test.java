package leetcode;

import org.junit.jupiter.api.Test;

public class P1893Test {

    @Test
    void test1() {
        int[][] ranges = new int[][] {{1, 15}, {11, 21}, {20, 30}};
        int left = 10;
        int right = 20;
        boolean expected = true;
        P1893 solution = new P1893();
        boolean actual = solution.isCovered(ranges, left, right);
        assert expected == actual;
    }
}
