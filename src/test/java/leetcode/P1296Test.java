package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1296Test {

    @Test
    @DisplayName("nums = [1,2,3,3,4,4,5,6], k = 4")
    void test1() {
        int[] nums = {1,2,3,3,4,4,5,6};
        int k = 4;
        assert new P1296().isPossibleDivide(nums, k);
    }
}
