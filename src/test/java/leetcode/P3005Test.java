package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P3005Test {

    @Test
    @DisplayName("nums = [1,2,2,3,1,4]")
    void maxFrequencyElements_Test1() {
        int[] nums = {1,2,2,3,1,4};
        P3005 solution = new P3005();
        assert solution.maxFrequencyElements(nums) == 4;
    }
}
