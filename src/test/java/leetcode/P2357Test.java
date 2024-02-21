package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2357Test {

    @Test
    @DisplayName("nums = [1,5,0,3,5]")
    void minimumOperations_Test1() {
        int[] nums = {1,5,0,3,5};
        P2357 solution = new P2357();
        assert solution.minimumOperations(nums) == 3;
    }

    @Test
    @DisplayName("nums = [0]")
    void minimumOperations_Test2() {
        int[] nums = {0};
        P2357 solution = new P2357();
        assert solution.minimumOperations(nums) == 0;
    }
}
