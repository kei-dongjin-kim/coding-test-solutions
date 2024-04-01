package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2444Test {

    @Test
    @DisplayName("nums = [1,3,5,2,7,5], minK = 1, maxK = 5")
    void countSubarrays_Test1() {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        long expected = 2;
        long actual = new P2444().countSubarrays(nums, minK, maxK);
        assert expected == actual;
    }
}
