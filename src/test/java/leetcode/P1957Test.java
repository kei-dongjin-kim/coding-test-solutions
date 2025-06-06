package leetcode;

import org.junit.jupiter.api.Test;

public class P1957Test {

    @Test
    void test1() {
        String s = "abbcccddddeeeee";
        String expected = "abbccddee";
        P1957 solution = new P1957();
        String actual = solution.makeFancyString(s);
        assert expected.equals(actual);
    }
}
