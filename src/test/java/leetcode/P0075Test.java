package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0075Test {

    @Test
    @DisplayName("nums = [5, 4, 3, 2, 1]")
    void test1() {
        P0075 p = new P0075();
        int[] nums = {5, 4, 3, 2, 1};
        p.sortColors(nums);
        assert nums[0] == 1;
        assert nums[1] == 2;
        assert nums[2] == 3;
        assert nums[3] == 4;
        assert nums[4] == 5;
    }
}
