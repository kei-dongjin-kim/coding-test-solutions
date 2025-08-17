package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1646Test {

    @Test
    void test1() {
        int n = 10;
        int expected = 4;
        P1646 solution = new P1646();
        int actual = solution.getMaximumGenerated(n);
        Assertions.assertEquals(expected, actual);
    }
}
