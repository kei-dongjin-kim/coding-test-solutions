package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1509Test {

    @Test
    @DisplayName("nums = [1,102,103,104,105]")
    void test1() {
        int[] nums = {1,102,103,104,105};
        P1509 solution = new P1509();
        assert solution.minDifference(nums) == 1;
    }
}
