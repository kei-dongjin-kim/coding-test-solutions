package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0912Test {

    @Test
    @DisplayName("nums = [5,4,3,2,1]")
    void test1() {
        int[] nums = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        P0912 solution = new P0912();
        int[] result = solution.sortArray(nums);
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == result[i];
        }
    }
}
