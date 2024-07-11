package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1190Test {

    @Test
    @DisplayName("s = (87(34(65))21)")
    void test1() {
        String s = "(87(34(65))21)";
        P1190 solution = new P1190();
        String actual = solution.reverseParentheses(s);
        String expected = "12345678";
        assert expected.equals(actual);
    }
}
