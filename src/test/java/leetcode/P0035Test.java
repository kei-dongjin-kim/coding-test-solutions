package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0035Test {

    @Test
    @DisplayName("nums = [1,3,5,7,9], target = 8")
    void test1() {
        int[] nums = {1,3,5,7,9};
        int target = 8;
        int expected = 4;
        int actual = new P0035().searchInsert(nums, target);
        assert actual == expected;
    }
}
