package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0330Test {

    @Test
    @DisplayName("nums = [1,2], n = 6")
    void test1() {
        int[] nums = {1, 2};
        int n = 6;
        int expected = 1;
        assert new P0330().minPatches(nums, n) == expected;
    }
}
