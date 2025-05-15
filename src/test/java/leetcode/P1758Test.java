package leetcode;

import org.junit.jupiter.api.Test;

public class P1758Test {

    @Test
    void test1() {
        String s = "01110";
        int expected = 1;
        P1758 solution = new P1758();
        int actual = solution.minOperations(s);
        assert expected == actual;
    }
}
