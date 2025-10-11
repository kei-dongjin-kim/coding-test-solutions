package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2937Test {

    @Test
    void test1() {
        String s1 = "abcde";
        String s2 = "ace";
        String s3 = "axx";
        int expected = 8;
        P2937 solution = new P2937();
        int actual = solution.findMinimumOperations(s1, s2, s3);
        Assertions.assertEquals(expected, actual);
    }
}
