package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2389Test {

    @Test
    @DisplayName("nums = [4,5,2,1], queries = [3,10,21]")
    void answerQueries_Test1() {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        P2389 solution = new P2389();
        int[] actual = solution.answerQueries(nums, queries);
        assert Arrays.equals(actual, new int[]{2, 3, 4});
    }

    @Test
    @DisplayName("nums = [2,3,4,5], queries = [1]")
    void answerQueries_Test2() {
        int[] nums = {2,3,4,5};
        int[] queries = {1};
        P2389 solution = new P2389();
        int[] actual = solution.answerQueries(nums, queries);
        assert Arrays.equals(actual, new int[]{0});
    }
}
