package leetcode;

import org.junit.jupiter.api.Test;

public class P2299Test {

    @Test
    void test1() {
        String password = "abcdefgH1#";
        boolean expected = true;
        P2299 solution = new P2299();
        boolean actual = solution.strongPasswordCheckerII(password);
        assert expected == actual;
    }
}
