package leetcode;

import org.junit.jupiter.api.Test;

public class P1844Test {

    @Test
    void test1() {
        String s = "a5b5c5";
        String expected = "afbgch";
        P1844 solution = new P1844();
        String actual = solution.replaceDigits(s);
        assert expected.equals(actual);
    }
}
