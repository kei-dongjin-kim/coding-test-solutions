package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0974Test {

    @Test
    @DisplayName("nums = [4,5,0,-2,-3,1], k = 5")
    void test1() {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int expected = 7;
        assert new P0974().subarraysDivByK(nums, k) == expected;
    }
}
