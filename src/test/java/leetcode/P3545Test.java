package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3545Test {

    @Test
    void test1() {
        String s = "aaaaabbbbcccddef";
        int k = 2;
        int expected = 7;
        P3545 solution = new P3545();
        int actual = solution.minDeletion(s, k);
        Assertions.assertEquals(expected, actual);
    }
}
