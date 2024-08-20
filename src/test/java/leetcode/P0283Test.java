package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0283Test {

    @Test
    @DisplayName("nums = [0, 0, 1, 2, 3]")
    void test1() {
        int[] nums = {0, 0, 1, 2, 3};
        new P0283().moveZeroes(nums);
        assert nums[0] == 1;
        assert nums[1] == 2;
        assert nums[2] == 3;
        assert nums[3] == 0;
        assert nums[4] == 0;
    }
}
