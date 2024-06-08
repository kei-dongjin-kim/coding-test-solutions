package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0026Test {

    @Test
    @DisplayName("nums = [1,1,2,2]")
    void test1() {
        int[] nums = {1, 1, 2, 2};
        int[] expected = {1, 2, 2, 2};
        int k = 2;
        P0026 solution = new P0026();
        int result = solution.removeDuplicates(nums);
        for (int i = 0; i < result; i++) {
            assert nums[i] == expected[i];
        }
        assert result == k;
    }
}
