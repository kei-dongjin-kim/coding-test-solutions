package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2697Test {

    @Test
    void test1() {
        String s = "hello";
        String expected = "heleh";
        P2697 solution = new P2697();
        String actual = solution.makeSmallestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }
}
