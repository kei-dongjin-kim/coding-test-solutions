package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P930Test {

    @Test
    @DisplayName("nums = [1,0,1,0,1], goal = 2")
    void numSubarraysWithSum_Test1() {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int expected = 4;
        assert new P930().numSubarraysWithSum(nums, goal) == expected;
    }
}
