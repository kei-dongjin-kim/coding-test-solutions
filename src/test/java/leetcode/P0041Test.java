package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0041Test {

    @Test
    @DisplayName("nums = [1,2,0]")
    void firstMissingPositive_Test1() {
        int[] nums = {1, 2, 0};
        int expected = 3;
        int actual = new P0041().firstMissingPositive(nums);
        assert actual == expected;
    }
}
