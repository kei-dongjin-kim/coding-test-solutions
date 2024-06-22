package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1248Test {

    @Test
    @DisplayName("nums = [2,2,2,1,2,2,1,2,2,2], k = 2")
    void test1() {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int actual = new P1248().numberOfSubarrays(nums, k);
        int expect = 16;
        assert actual == expect;
    }
}
