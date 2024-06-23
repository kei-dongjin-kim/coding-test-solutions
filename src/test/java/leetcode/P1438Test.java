package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1438Test {

    @Test
    @DisplayName("nums = [1,2,3,4], limit = 2")
    void test1() {
        int[] nums = {1, 2, 3, 4};
        int limit = 2;
        int expected = 3;
        int actual = new P1438().longestSubarray(nums, limit);
        assert actual == expected;
    }
}
