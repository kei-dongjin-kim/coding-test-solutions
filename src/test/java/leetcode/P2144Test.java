package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2144Test {

    @Test
    void test1() {
        int[] cost = new int[] {1, 2, 3, 4, 5};
        int expected = 12;
        P2144 solution = new P2144();
        int actual = solution.minimumCost(cost);
        Assertions.assertEquals(expected, actual);
    }
}
