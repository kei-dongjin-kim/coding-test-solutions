package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0645Test {

    @Test
    @DisplayName("[1,2,2,4]")
    void findErrorNums1() {
        P0645 solution = new P0645();
        int[] nums = {1,2,2,4};
        int[] result = solution.findErrorNums(nums);
        assert(result[0] == 2);
        assert(result[1] == 3);
    }

    @Test
    @DisplayName("[1,1]")
    void findErrorNums2() {
        P0645 solution = new P0645();
        int[] nums = {1,1};
        int[] result = solution.findErrorNums(nums);
        assert(result[0] == 1);
        assert(result[1] == 2);
    }
}
