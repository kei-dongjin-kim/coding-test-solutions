package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2839Test {

    @Test
    void test1() {
        String s1 = "cbad";
        String s2 = "abcd";
        boolean expected = true;
        P2839 solution = new P2839();
        boolean actual = solution.canBeEqual(s1, s2);
        Assertions.assertEquals(expected, actual);
    }
}
