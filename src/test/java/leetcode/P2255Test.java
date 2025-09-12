package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2255Test {

    @Test
    void test1() {
        String[] words = new String[] {"a", "ab", "abc", "abcd", "abcde", "x", "y", "z"};
        String s = "abcdefg";
        int expected = 5;
        P2255 solution = new P2255();
        int actual = solution.countPrefixes(words, s);
        Assertions.assertEquals(expected, actual);
    }
}
