package leetcode;

import org.junit.jupiter.api.Test;

public class P1332Test {

    @Test
    void test1() {
        String s = "ababa";
        int expected = 1;
        P1332 solution = new P1332();
        int actual = solution.removePalindromeSub(s);
        assert expected == actual;
    }
}
