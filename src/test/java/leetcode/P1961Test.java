package leetcode;

import org.junit.jupiter.api.Test;

public class P1961Test {

    @Test
    void test1() {
        String s = "ABC";
        String[] words = new String[] {"A", "B", "C", "D", "E"};
        boolean expected = true;
        P1961 solution = new P1961();
        boolean actual = solution.isPrefixString(s, words);
        assert expected == actual;
    }
}
