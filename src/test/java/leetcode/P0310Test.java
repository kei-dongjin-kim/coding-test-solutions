package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0310Test {

    @Test
    @DisplayName("n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]")
    void test1() {
        int n = 6;
        int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected = List.of(3, 4);
        List<Integer> actual = new P0310().findMinHeightTrees(n, edges);
        assert expected.equals(actual);
    }
}
