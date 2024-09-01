package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2022Test {

    @Test
    @DisplayName("original = [1,2,3,4,5,6], m = 3, n = 2")
    void test1() {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 3;
        int n = 2;
        int[][] expected = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int[][] actual = new P2022().construct2DArray(original, m, n);
        assert expected.length == actual.length;
        for (int i = 0; i < expected.length; i++) {
            assert expected[i].length == actual[i].length;
            for (int j = 0; j < expected[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
