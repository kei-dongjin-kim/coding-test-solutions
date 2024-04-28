package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0834Test {

    @Test
    @DisplayName("n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]")
    void test1() {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};
        int[] expected = {8,12,6,10,10,10};
        int[] actual = new P0834().sumOfDistancesInTree(n, edges);
        assert Arrays.equals(expected, actual);
    }
}
