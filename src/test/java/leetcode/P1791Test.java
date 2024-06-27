package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1791Test {

    @Test
    @DisplayName("edges = [[1,2],[1,3],[1,4]]")
    void test1() {
        int[][] edges = {{1, 2}, {1, 3}, {1, 4}};
        int expected = 1;
        assert new P1791().findCenter(edges) == expected;
    }
}
