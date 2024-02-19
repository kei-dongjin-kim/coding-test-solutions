package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P2099Test {

    @Test
    @DisplayName("nums = [2,1,3,3], k = 2")
    void maxSubsequence_Test1() {
        int[] nums = {2,1,3,3};
        int k = 2;
        P2099 solution = new P2099();
        int[] result = solution.maxSubsequence(nums, k);
        int[] expected = {3,3};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("nums = [-1,-2,3,4], k = 3")
    void maxSubsequence_Test2() {
        int[] nums = {-1,-2,3,4};
        int k = 3;
        P2099 solution = new P2099();
        int[] result = solution.maxSubsequence(nums, k);
        int[] expected = {-1,3,4};
        assertArrayEquals(expected, result);
    }

}
