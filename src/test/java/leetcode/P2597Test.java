package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2597Test {

    @Test
    @DisplayName("nums = [2,4,6], k = 2")
    void test1() {
        int[] nums = {2, 4, 6};
        int k = 2;
        int expected = 4;
        P2597 solution = new P2597();
        int actual = solution.beautifulSubsets(nums, k);
        assert(expected == actual);
    }
}
