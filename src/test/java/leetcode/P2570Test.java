package leetcode;

import org.junit.jupiter.api.Test;

public class P2570Test {

    @Test
    void test1() {
        int[][] nums1 = new int[][] {{1, 1}, {2, 2}, {3, 3}};
        int[][] nums2 = new int[][] {{1, 1}, {3, 3}, {4, 4}};
        int[][] expected = new int[][] {{1, 2}, {2, 2}, {3, 6}, {4, 4}};
        P2570 solution = new P2570();
        int[][] actual = solution.mergeArrays(nums1, nums2);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
}
