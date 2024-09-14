package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1419Test {

    @Test
    @DisplayName("nums = [1,2,3,4,4,1,1]")
    void test1() {
        int[] nums = new int[] {1,2,3,4,4,1,1};
        int expected = 2;
        int actual = new P1419().longestSubarray(nums);
        assert expected == actual;
    }

}
