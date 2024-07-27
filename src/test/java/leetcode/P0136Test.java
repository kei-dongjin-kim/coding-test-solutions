package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0136Test {

    @Test
    @DisplayName("nums = [1,2,3,4,5,1,2,3,4,5,6]")
    void test1() {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};
        int expected = 6;
        assert new P0136().singleNumber(nums) == expected;
    }
}
