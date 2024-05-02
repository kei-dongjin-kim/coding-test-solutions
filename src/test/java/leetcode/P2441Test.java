package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2441Test {

    @Test
    @DisplayName("[-1,1,-3,3]")
    void test1() {
        int[] nums = {-1, 1, -3, 3};
        int expected = 3;
        int actual = new P2441().findMaxK(nums);
        assert actual == expected;
    }
}
