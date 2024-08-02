package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0169Test {

    @Test
    @DisplayName("nums = [1, 1, 3]")
    void test1() {
        int[] nums = {1, 1, 3};
        int expected = 1;
        assert new P0169().majorityElement(nums) == expected;
    }
}
