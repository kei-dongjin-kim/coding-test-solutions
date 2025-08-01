package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P2544Test {

    @Test
    void test1() {
        int n = 12345;
        int expected = 3;
        P2544 solution = new P2544();
        int actual = solution.alternateDigitSum(n);
        Assertions.assertEquals(expected, actual);
    }
}
