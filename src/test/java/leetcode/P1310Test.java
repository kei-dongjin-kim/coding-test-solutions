package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1310Test {

    @Test
    @DisplayName("arr = [1,2,3,4], queries = [[0,1],[1,2],[2,3],[3,3]]")
    void test1() {
        int[] arr = new int[] {1, 2, 3, 4};
        int[][] queries = new int[][] {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 3}
        };
        int[] expected = new int[] {3, 1, 7, 4};
        int[] actual = new P1310().xorQueries(arr, queries);
        assert Arrays.equals(expected, actual);
    }

}
