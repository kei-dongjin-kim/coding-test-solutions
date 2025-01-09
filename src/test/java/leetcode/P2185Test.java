package leetcode;

import org.junit.jupiter.api.Test;

public class P2185Test {

    @Test
    void test1() {
        String[] words = new String[] {"hello", "abcdefg", "abcxyz", "abchijk"};
        String pref = "abc";
        int expected = 3;
        P2185 solution = new P2185();
        int actual = solution.prefixCount(words, pref);
        assert actual == expected;
    }
}
