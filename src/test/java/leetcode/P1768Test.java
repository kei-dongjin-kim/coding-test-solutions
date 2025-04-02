package leetcode;

import org.junit.jupiter.api.Test;

public class P1768Test {

    @Test
    void test1() {
        String word1 = "ac";
        String word2 = "bdefg";
        String expected = "abcdefg";
        P1768 solution = new P1768();
        String actual = solution.mergeAlternately(word1, word2);
        assert expected.equals(actual);
    }
}
