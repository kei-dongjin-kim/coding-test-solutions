package leetcode;

import org.junit.jupiter.api.Test;

public class P1281Test {

    @Test
    void test1() {
        int n = 123;
        int expected = 0;
        P1281 solution = new P1281();
        int actual = solution.subtractProductAndSum(n);
        assert expected == actual;
    }
}
