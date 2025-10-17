package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0821Test {

    @Test
    void test1() {
        String s = "helloworld";
        char c = 'l';
        int[] expected = new int[] {2, 1, 0, 0, 1, 2, 2, 1, 0, 1};
        P0821 solution = new P0821();
        int[] actual = solution.shortestToChar(s, c);
        Assertions.assertArrayEquals(expected, actual);
    }
}
