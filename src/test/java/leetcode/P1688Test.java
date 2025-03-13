package leetcode;

import org.junit.jupiter.api.Test;

public class P1688Test {

    @Test
    void test1() {
        int n = 11;
        int expected = 10;
        P1688 solution = new P1688();
        int actual = solution.numberOfMatches(n);
        assert expected == actual;
    }
}
