package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1642Test {

    @Test
    @DisplayName("heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1")
    void furthestBuilding_Test1() {
        int[] heights = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladders = 1;
        int expected = 4;

        P1642 solution = new P1642();
        assert expected == solution.furthestBuilding(heights, bricks, ladders);
    }

    @Test
    @DisplayName("heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2")
    void furthestBuilding_Test2() {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        int bricks = 10;
        int ladders = 2;
        int expected = 7;

        P1642 solution = new P1642();
        assert expected == solution.furthestBuilding(heights, bricks, ladders);
    }

    @Test
    @DisplayName("heights = [14,3,19,3], bricks = 17, ladders = 0")
    void furthestBuilding_Test3() {
        int[] heights = {14,3,19,3};
        int bricks = 17;
        int ladders = 0;
        int expected = 3;

        P1642 solution = new P1642();
        assert expected == solution.furthestBuilding(heights, bricks, ladders);
    }
}
