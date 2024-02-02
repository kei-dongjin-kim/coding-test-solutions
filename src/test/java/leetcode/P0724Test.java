package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0724Test {

    @Test
    @DisplayName("[1,7,3,6,5,6]")
    void pivotIndex_Test1() {
        int[] nums = {1,7,3,6,5,6};
        P0724 solution = new P0724();
        int result = solution.pivotIndex(nums);
        assert result == 3;
    }

    @Test
    @DisplayName("[1,2,3]")
    void pivotIndex_Test2() {
        int[] nums = {1,2,3};
        P0724 solution = new P0724();
        int result = solution.pivotIndex(nums);
        assert result == -1;
    }

    @Test
    @DisplayName("[2,1,-1]")
    void pivotIndex_Test3() {
        int[] nums = {2,1,-1};
        P0724 solution = new P0724();
        int result = solution.pivotIndex(nums);
        assert result == 0;
    }
}
