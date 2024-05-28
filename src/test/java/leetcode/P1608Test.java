package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1608Test {

    @Test
    @DisplayName("nums = [3,5]")
    void test1() {
        int[] nums = {3, 5};
        int expected = 2;
        int actual = new P1608().specialArray(nums);
        assert expected == actual;
    }
}
