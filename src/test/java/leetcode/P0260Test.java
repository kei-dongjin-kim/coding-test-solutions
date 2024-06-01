package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0260Test {

    @Test
    @DisplayName("nums = [1,2,1,3,2,5]")
    void test1() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] expected1 = {3, 5};
        int[] expected2 = {5, 3};
        int[] actual = new P0260().singleNumber(nums);
        assert (actual[0] == expected1[0] && actual[1] == expected1[1]) || (actual[0] == expected2[0] && actual[1] == expected2[1]);
    }
}
