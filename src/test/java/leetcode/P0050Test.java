package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0050Test {

    @Test
    @DisplayName("intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]")
    void insert_Test1() {
        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[]{4, 8};
        int[][] expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
        int[][] actual = new P0050().insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(actual));
        assert Arrays.deepEquals(expected, actual);
    }
}
