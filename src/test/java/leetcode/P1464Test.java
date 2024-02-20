package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1464Test {

    @Test
    @DisplayName("nums = [3,4,5,2]")
    void maxProduct_Test1() {
        int[] nums = {3,4,5,2};
        int expected = 12;
        assert new P1464().maxProduct(nums) == expected;
    }
}
