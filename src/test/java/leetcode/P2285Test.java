package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2285Test {

    @Test
    @DisplayName("n = 5, roads = [[0,1],[1,2],[2,3],[3,4],[4,0]]")
    void test1() {
        int n = 5;
        int[][] roads = {{0,1},{1,2},{2,3},{3,4},{4,0}};
        P2285 solution = new P2285();
        long actual = solution.maximumImportance(n, roads);
        long expect = 30;
        assert expect == actual;
    }
}
