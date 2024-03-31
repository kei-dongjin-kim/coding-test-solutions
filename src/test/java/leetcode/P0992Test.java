package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0992Test {

    @Test
    @DisplayName("nums = [1,2,1,2,3], k = 2")
    void subarraysWithKDistinct_Test1() {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int expected = 7;
        int actual = new P0992().subarraysWithKDistinct(nums, k);
        assert actual == expected;
    }
}
