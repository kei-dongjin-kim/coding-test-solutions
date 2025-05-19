package leetcode;

import org.junit.jupiter.api.Test;

public class P1417Test {

    @Test
    void test1() {
        String s = "1234abcde";
        String expected = "a1b2c3d4e";
        P1417 solution = new P1417();
        String actual = solution.reformat(s);
        assert expected.equals(actual);
    }
}
