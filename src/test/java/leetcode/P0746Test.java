package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0746Test {

    @Test
    @DisplayName("[10,15,20]")
    void minCostClimbingStairs1() {
        P0746 solution = new P0746();
        assert(15 == solution.minCostClimbingStairs(new int[]{10,15,20}));
    }

    @Test
    @DisplayName("[1,100,1,1,1,100,1,1,100,1]")
    void minCostClimbingStairs2() {
        P0746 solution = new P0746();
        assert(6 == solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
