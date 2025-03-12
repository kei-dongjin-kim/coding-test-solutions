package leetcode;

import org.junit.jupiter.api.Test;

public class P1816Test {

    @Test
    void test1() {
        String s = "a b c d e f";
        int k = 3;
        String expected = "a b c";
        P1816 solution = new P1816();
        String actual = solution.truncateSentence(s, k);
        assert expected.equals(actual);
    }
}
