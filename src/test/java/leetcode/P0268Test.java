package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0268Test {

    @Test
    @DisplayName("nums = [3,0,1]")
    void missingNumber_Test1() {
        int[] nums = {3, 0, 1};
        int expected = 2;
        assert new P0268().missingNumber(nums) == expected;
    }

    @Test
    @DisplayName("nums = [0,1]")
    void missingNumber_Test2() {
        int[] nums = {0, 1};
        int expected = 2;
        assert new P0268().missingNumber(nums) == expected;
    }

    @Test
    @DisplayName("nums = [9,6,4,2,3,5,7,0,1]")
    void missingNumber_Test3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        assert new P0268().missingNumber(nums) == expected;
    }
}
