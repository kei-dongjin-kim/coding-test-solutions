package leetcode;

import org.junit.jupiter.api.Test;

public class P2413Test {

    @Test
    void test1() {
        int n = 7;
        int expected = 14;
        P2413 solution = new P2413();
        int actual = solution.smallestEvenMultiple(n);
        assert expected == actual;
    }
}
