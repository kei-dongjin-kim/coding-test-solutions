package leetcode;

import org.junit.jupiter.api.Test;

public class P1592Test {

    @Test
    void test1() {
        String text = "   abc   def   ghi";
        String expected = "abc    def    ghi ";
        P1592 solution = new P1592();
        String actual = solution.reorderSpaces(text);
        assert expected.equals(actual);
    }
}
