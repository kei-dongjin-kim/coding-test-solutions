package leetcode;

import org.junit.jupiter.api.Test;

public class P2108Test {

    @Test
    void test1() {
        String[] words = new String[] {"abc", "def", "ghi", "jkl", "xox"};
        String expected = "xox";
        P2108 solution = new P2108();
        String actual = solution.firstPalindrome(words);
        assert expected.equals(actual);
    }
}
