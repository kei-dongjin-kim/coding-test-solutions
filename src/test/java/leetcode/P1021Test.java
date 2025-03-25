package leetcode;

import org.junit.jupiter.api.Test;

public class P1021Test {

    @Test
    void test1() {
        String s = "((()())()())(()()())";
        String expected = "(()())()()()()()";
        P1021 solution = new P1021();
        String actual = solution.removeOuterParentheses(s);
        assert expected.equals(actual);
    }
}
