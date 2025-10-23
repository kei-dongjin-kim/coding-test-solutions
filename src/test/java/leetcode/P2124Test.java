package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2124Test {

    @Test
    void test1() {
        String s = "aaaaaaabbb";
        boolean expected = true;
        P2124 solution = new P2124();
        boolean actual = solution.checkString(s);
        Assertions.assertEquals(expected, actual);
    }
}
