package leetcode;

import org.junit.jupiter.api.Test;

public class P1323Test {

    @Test
    void test1() {
        int num = 69;
        int expected = 99;
        P1323 solution = new P1323();
        int actual = solution.maximum69Number(num);
        assert expected == actual;
    }
}
