package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0342Test {

    @Test
    void test1() {
        int n = 64;
        boolean expected = true;
        P0342 solution = new P0342();
        boolean actual = solution.isPowerOfFour(n);
        Assertions.assertEquals(expected, actual);
    }
}
