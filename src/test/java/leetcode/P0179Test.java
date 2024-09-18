package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0179Test {

    @Test
    @DisplayName("nums = [1, 2, 3, 15]")
    void test1() {
        int[] nums = {1, 2, 3, 15};
        String expected = "32151";
        P0179 solution = new P0179();
        String actual = solution.largestNumber(nums);
        assert expected.equals(actual);
    }
}
