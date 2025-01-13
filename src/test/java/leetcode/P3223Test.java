package leetcode;

import org.junit.jupiter.api.Test;

public class P3223Test {

    @Test
    void test1() {
        String s = "abcabcabc";
        int expected = 3;
        P3223 solution = new P3223();
        int actual = solution.minimumLength(s);
        assert expected == actual;
    }
}
