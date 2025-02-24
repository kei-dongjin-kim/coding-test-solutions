package leetcode;

import org.junit.jupiter.api.Test;

public class P2652Test {

    @Test
    void test1() {
        int n = 11;
        int expected = 40;
        P2652 solution = new P2652();
        int actual = solution.sumOfMultiples(n);
        assert expected == actual;
    }
}
