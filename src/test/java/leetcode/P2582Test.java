package leetcode;

import org.junit.jupiter.api.Test;

public class P2582Test {

    @Test
    void test1() {
        int n = 3;
        int time = 10;
        int expected = 3;
        P2582 solution = new P2582();
        int actual = solution.passThePillow(n, time);
        assert expected == actual;
    }
}
