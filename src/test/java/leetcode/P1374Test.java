package leetcode;

import org.junit.jupiter.api.Test;

public class P1374Test {

    @Test
    void test1() {
        int n = 4;
        String expected = "aaab";
        P1374 solution = new P1374();
        String actual = solution.generateTheString(n);
        assert expected.equals(actual);
    }
}
