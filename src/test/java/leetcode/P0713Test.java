package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0713Test {

    @Test
    @DisplayName("nums = [10,5,2,6], k = 100")
    void numSubarrayProductLessThanK_Test1() {
        int[] nums = {10,5,2,6};
        int k = 100;
        int expected = 8;
        int actual = new P0713().numSubarrayProductLessThanK(nums, k);
        assert expected == actual;
    }
}
