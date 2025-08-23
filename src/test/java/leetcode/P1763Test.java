package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1763Test {

    @Test
    void test1() {
        String s = "abcdeDEfg";
        String expected = "deDE";
        P1763 solution = new P1763();
        String actual = solution.longestNiceSubstring(s);
        Assertions.assertEquals(expected, actual);
    }
}
