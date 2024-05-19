package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P3068Test {

    @Test
    @DisplayName("nums = [1,2,1], k = 3, edges = [[0,1],[0,2]]")
    void test1() {
        int[] nums = {1, 2, 1};
        int k = 3;
        int[][] edges = {{0, 1}, {0, 2}};
        long expect = 6;
        P3068 solution = new P3068();
        long actual = solution.maximumValueSum(nums, k, edges);
        assert expect == actual;
    }
}
