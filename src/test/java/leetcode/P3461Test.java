package leetcode;

import org.junit.jupiter.api.Test;

public class P3461Test {

    @Test
    void test1() {
        String s = "54321";
        boolean expected = false;
        P3461 solution = new P3461();
        boolean actual = solution.hasSameDigits(s);
        assert expected == actual;
    }
}
