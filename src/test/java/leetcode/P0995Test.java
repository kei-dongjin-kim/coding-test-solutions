package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0995Test {

    @Test
    @DisplayName("nums = [0,0,0,1,1,1], k = 3")
    void test1() {
        int[] nums = {0,0,0,1,1,1};
        int k = 3;
        assert new P0995().minKBitFlips(nums, k) == 1;
    }
}
