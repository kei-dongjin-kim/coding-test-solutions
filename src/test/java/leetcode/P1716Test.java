package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1716Test {

    @Test
    void test1() {
        int n = 11;
        int expected = 42;
        P1716 solution = new P1716();
        int actual = solution.totalMoney(n);
        Assertions.assertEquals(expected, actual);
    }
}
