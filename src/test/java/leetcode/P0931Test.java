package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0931Test {

    @Test
    @DisplayName("[[2,1,3],[6,5,4],[7,8,9]]")
    void minFallingPathSum1() {
        P0931 solution = new P0931();
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int result = solution.minFallingPathSum(matrix);
        assert result == 13;
    }

}
