package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2997Test {

    @Test
    @DisplayName("nums = [2,1,3,4], k = 1")
    void test1() {
        int[] nums = {2, 1, 3, 4};
        int k = 1;
        int expected = 2;
        int actual = new P2997().minOperations(nums, k);
        assert actual == expected;
    }
}
