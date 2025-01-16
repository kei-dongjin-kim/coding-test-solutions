package leetcode;

import org.junit.jupiter.api.Test;

public class P2235Test {

    @Test
    void test1() {
        int num1 = 2, num2 = 3;
        int expected = 5;
        P2235 solution = new P2235();
        int actual = solution.sum(num1, num2);
        assert expected == actual;
    }
}
