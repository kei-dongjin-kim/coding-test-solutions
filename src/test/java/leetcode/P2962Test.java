package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2962Test {

    @Test
    @DisplayName("nums = [1,3,2,3,3], k = 2")
    void countSubarrays_Test1() {
        int[] nums = {1,3,2,3,3};
        int k = 2;
        P2962 solution = new P2962();
        long actual = solution.countSubarrays(nums, k);
        long expected = 6;
        assert expected == actual;
    }
}
