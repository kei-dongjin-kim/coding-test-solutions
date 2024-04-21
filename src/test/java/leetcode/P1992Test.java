package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1992Test {

    @Test
    @DisplayName("land = [[1,0,0],[0,1,1],[0,1,1]]")
    void test1() {
        int[][] land = {{1,0,0},{0,1,1},{0,1,1}};
        int[][] expected = {{0,0,0,0},{1,1,2,2}};
        assert Arrays.deepEquals(expected, new P1992().findFarmland(land));
    }
}
