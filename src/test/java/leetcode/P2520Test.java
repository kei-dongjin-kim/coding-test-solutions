package leetcode;

import org.junit.jupiter.api.Test;

public class P2520Test {

    @Test
    void tset1() {
        int num = 7321;
        int expected = 1;
        P2520 solution = new P2520();
        int actual = solution.countDigits(num);
        assert expected == actual;
    }
}
