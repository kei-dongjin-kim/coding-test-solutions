package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2373Test {

    @Test
    @DisplayName("grid = [[1,2,3],[4,5,6],[7,8,9]]")
    void test1() {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{9}};
        int[][] actual = new P2373().largestLocal(grid);
        assert Arrays.deepEquals(actual, expected);
    }

    @Test
    @DisplayName("grid = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]")
    void test2() {
        int[][] grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] expected = {{11,12},{15,16}};
        int[][] actual = new P2373().largestLocal(grid);
        assert Arrays.deepEquals(actual, expected);
    }

    @Test
    @DisplayName("grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]")
    void test3() {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] expected = {{9,9},{8,6}};
        int[][] actual = new P2373().largestLocal(grid);
        assert Arrays.deepEquals(actual, expected);
    }
}
