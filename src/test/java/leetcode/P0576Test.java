package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0576Test {

    @Test
    @DisplayName("m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0")
    void findPaths1() {
        P0576 p0576 = new P0576();
        assert 6 == p0576.findPaths(2, 2, 2, 0, 0);
    }

    @Test
    @DisplayName("m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1")
    void findPaths2() {
        P0576 p0576 = new P0576();
        assert 12 == p0576.findPaths(1, 3, 3, 0, 1);
    }

    @Test
    @DisplayName("m = 8, n = 50, maxMove = 23, startRow = 5, startColumn = 26")
    void findPaths3() {
        P0576 p0576 = new P0576();
        assert 914783380 == p0576.findPaths(8, 50, 23, 5, 26);
    }
}
