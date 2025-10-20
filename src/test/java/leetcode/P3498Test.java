package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3498Test {

    @Test
    void test1() {
        String s = "test";
        int expected = 103;
        P3498 solution = new P3498();
        int actual = solution.reverseDegree(s);
        Assertions.assertEquals(expected, actual);
    }
}
