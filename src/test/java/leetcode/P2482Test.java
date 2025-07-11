package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class P2482Test {

    @Test
    void test1() {
        int[][] grid = new int[][] {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int[][] expected = new int[][] {{2, 0, 2}, {0, -2, 0}, {2, 0, 2}};
        P2482 solution = new P2482();
        int[][] actual = solution.onesMinusZeros(grid);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
