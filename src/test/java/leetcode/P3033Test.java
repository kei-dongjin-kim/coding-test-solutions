package leetcode;

import org.junit.jupiter.api.Test;

public class P3033Test {

    @Test
    void test1() {
        int[][] matrix = new int[][] {{-1, 2, 3}, {4, 5, -1}, {7, -1, 9}};
        int[][] expected = new int[][] {{7, 2, 3}, {4, 5, 9}, {7, 5, 9}};
        P3033 solution = new P3033();
        int[][] actual = solution.modifiedMatrix(matrix);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
