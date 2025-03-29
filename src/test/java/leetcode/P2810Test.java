package leetcode;

import org.junit.jupiter.api.Test;

public class P2810Test {

    @Test
    void test1() {
        String s = "cbaidef";
        String exptected = "abcdef";
        P2810 solution = new P2810();
        String actual = solution.finalString(s);
        assert actual.equals(exptected);
    }
}
