package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1508Test {

    @Test
    @DisplayName("nums = [1,2,3], n = 3, left = 1, right = 3")
    void test1() {
        int[] nums = {1, 2, 3};
        int n = 3;
        int left = 1;
        int right = 3;
        P1508 solution = new P1508();
        assert solution.rangeSum(nums, n, left, right) == 6;
    }
}
