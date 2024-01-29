package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1074Test {

    @Test
    @DisplayName("matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0")
    void numSubmatrixSumTarget1() {
        P1074 solution = new P1074();
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int target = 0;
        int expected = 4;
        assert expected == solution.numSubmatrixSumTarget(matrix, target);
    }

    @Test
    @DisplayName("matrix = [[1,-1],[-1,1]], target = 0")
    void numSubmatrixSumTarget2() {
        P1074 solution = new P1074();
        int[][] matrix = {{1, -1}, {-1, 1}};
        int target = 0;
        int expected = 5;
        assert expected == solution.numSubmatrixSumTarget(matrix, target);
    }
}
