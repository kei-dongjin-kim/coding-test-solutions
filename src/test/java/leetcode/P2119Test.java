package leetcode;

import org.junit.jupiter.api.Test;

public class P2119Test {

    @Test
    void test1() {
        int num = 100;
        boolean expected = false;
        P2119 solution = new P2119();
        boolean actual = solution.isSameAfterReversals(num);
        assert expected == actual;
    }
}
