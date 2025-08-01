package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P2549Test {

    @Test
    void test1() {
        int n = 10;
        int expected = 9;
        P2549 solution = new P2549();
        int actual = solution.distinctIntegers(n);
        Assertions.assertEquals(expected, actual);
    }
}
