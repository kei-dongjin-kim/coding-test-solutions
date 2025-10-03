package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2586Test {

    @Test
    void test1() {
        String[] words = new String[] {"aaa", "aaa", "bbb", "aaa", "aaa"};
        int left = 1;
        int right = 3;
        int expected = 2;
        P2586 solution = new P2586();
        int actual = solution.vowelStrings(words, left, right);
        Assertions.assertEquals(expected, actual);
    }
}
