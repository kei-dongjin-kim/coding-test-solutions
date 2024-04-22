package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1971Test {

    @Test
    @DisplayName("n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2")
    void test1() {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;
        boolean expected = true;
        assert expected == new P1971().validPath(n, edges, source, destination);
    }

    @Test
    @DisplayName("n = 10, edges =[[0,7],[0,8],[6,1],[2,0],[0,4],[5,8],[4,7],[1,3],[3,5],[6,5]] source = 7, destination = 5")
    void test2() {
        int n = 10;
        int[][] edges = {{0, 7}, {0, 8}, {6, 1}, {2, 0}, {0, 4}, {5, 8}, {4, 7}, {1, 3}, {3, 5}, {6, 5}};
        int source = 7;
        int destination = 5;
        boolean expected = true;
        assert expected == new P1971().validPath(n, edges, source, destination);
    }
}
