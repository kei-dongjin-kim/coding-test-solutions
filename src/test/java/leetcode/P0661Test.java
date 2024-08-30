package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0661Test {

    @Test
    @DisplayName("img = [[1,2,1],[2,0,2],[1,2,1]]")
    void test1() {
        int[][] img = {
            {1, 2, 1},
            {2, 0, 2},
            {1, 2, 1}
        };
        int[][] expected = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        int[][] actual = new P0661().imageSmoother(img);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
