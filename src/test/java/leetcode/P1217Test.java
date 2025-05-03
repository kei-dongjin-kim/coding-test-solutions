package leetcode;

import org.junit.jupiter.api.Test;

public class P1217Test {

    @Test
    void test1() {
        int[] position = new int[] {1, 2, 3, 5, 7, 9};
        int expected = 1;
        P1217 solution = new P1217();
        int actual = solution.minCostToMoveChips(position);
        assert expected == actual;
    }
}
