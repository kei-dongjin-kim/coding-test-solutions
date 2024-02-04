package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1413Test {

    @Test
    @DisplayName("nums = [-3,2,-3,4,2]")
    void minStartValue_Test1() {
        int[] nums = {-3,2,-3,4,2};
        int expected = 5;
        assert new P1413().minStartValue(nums) == expected;
    }

    @Test
    @DisplayName("nums = [1,2]")
    void minStartValue_Test2() {
        int[] nums = {1,2};
        int expected = 1;
        assert new P1413().minStartValue(nums) == expected;
    }

    @Test
    @DisplayName("nums = [1,-2,-3]")
    void minStartValue_Test3() {
        int[] nums = {1,-2,-3};
        int expected = 5;
        assert new P1413().minStartValue(nums) == expected;
    }
}
