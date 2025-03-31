package leetcode;

import org.junit.jupiter.api.Test;

public class P1859Test {

    @Test
    void test1() {
        String s = "E5 D4 C3 B2 A1";
        String expected = "A B C D E";
        P1859 solution = new P1859();
        String actual = solution.sortSentence(s);
        assert expected.equals(actual);
    }
}
