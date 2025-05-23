package leetcode;

import org.junit.jupiter.api.Test;

public class P2269Test {

    @Test
    void test1() {
        int num = 1000;
        int k = 2;
        int expected = 1;
        P2269 solution = new P2269();
        int actual = solution.divisorSubstrings(num, k);
        assert expected == actual;
    }
}
