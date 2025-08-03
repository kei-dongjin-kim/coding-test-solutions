package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P2481Test {

    @Test
    void test1() {
        int n = 7;
        int expected = 7;
        P2481 solution = new P2481();
        int actual = solution.numberOfCuts(n);
        Assertions.assertEquals(expected, actual);
    }
}
