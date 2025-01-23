package leetcode;

import org.junit.jupiter.api.Test;

public class P2894Test {

    @Test
    void test1() {
        int n = 3;
        int m = 2;
        int expected = 2;
        P2894 solution = new P2894();
        int actual = solution.differenceOfSums(n, m);
        assert expected == actual;
    }
}
