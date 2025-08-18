package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1805Test {

    @Test
    void test1() {
        String word = "1a01a001a2034";
        int  expected = 2;
        P1805 solution = new P1805();
        int actual = solution.numDifferentIntegers(word);
        Assertions.assertEquals(expected, actual);
    }
}
