package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0525Test {

    @Test
    @DisplayName("[0, 0, 1, 0, 0, 0, 1, 1]")
    void findMaxLength_Test1() {
        int[] nums = {0, 0, 1, 0, 0, 0, 1, 1};
        int expected = 6;
        int actual = new P0525().findMaxLength(nums);
        assert actual == expected;
    }
}
