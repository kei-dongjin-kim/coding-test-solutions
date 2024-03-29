package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2958Test {

    @Test
    @DisplayName("nums = [1,2,3,1,2,3,1,2], k = 2")
    void maxSubarrayLength_Test1() {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        P2958 solution = new P2958();
        int actual = solution.maxSubarrayLength(nums, k);
        int expected = 6;
        assert expected == actual;
    }

    @Test
    @DisplayName("nums = [2,2,3], k = 1")
    void maxSubarrayLength_Test2() {
        int[] nums = {2,2,3};
        int k = 1;
        P2958 solution = new P2958();
        int actual = solution.maxSubarrayLength(nums, k);
        int expected = 2;
        assert expected == actual;
    }
}
