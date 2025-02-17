package leetcode;

import org.junit.jupiter.api.Test;

public class P1486Test {

    @Test
    void test1() {
        int n = 10;
        int start = 1;
        int expected = 10;
        P1486 solution = new P1486();
        int actual = solution.xorOperation(start, n);
        assert expected == actual;
    }
}
