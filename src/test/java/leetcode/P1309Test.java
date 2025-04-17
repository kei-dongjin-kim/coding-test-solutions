package leetcode;

import org.junit.jupiter.api.Test;

public class P1309Test {

    @Test
    void test1() {
        String s = "12#15#22#5";
        String expected = "love";
        P1309 solution = new P1309();
        String actual = solution.freqAlphabets(s);
        assert expected.equals(actual);
    }
}
