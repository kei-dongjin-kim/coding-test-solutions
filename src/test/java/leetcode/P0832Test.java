package leetcode;

import org.junit.jupiter.api.Test;

public class P0832Test {

    @Test
    void test1() {
        int[][] image = new int[][] {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
        int[][] expected = new int[][] {{1, 1, 0}, {1, 1, 0}, {1, 1, 0}};
        P0832 solution = new P0832();
        int[][] actual = solution.flipAndInvertImage(image);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
