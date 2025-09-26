package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3274Test {

    @Test
    void test1() {
        String coordinate1 = "a1";
        String coordinate2 = "c3";
        boolean expected = true;
        P3274 solution = new P3274();
        boolean actual = solution.checkTwoChessboards(coordinate1, coordinate2);
        Assertions.assertEquals(expected, actual);
    }
}
