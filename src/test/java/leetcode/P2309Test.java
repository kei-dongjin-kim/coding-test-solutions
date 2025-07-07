package leetcode;

import org.junit.jupiter.api.Test;

public class P2309Test {

    @Test
    void test1() {
        String s = "AaBbCcDEFZz";
        String expect = "Z";
        P2309 solution = new P2309();
        String actual = solution.greatestLetter(s);
        assert expect.equals(actual);
    }
}
