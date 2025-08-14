package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1507Test {

    @Test
    void test1() {
        String date = "21st Aug 2025";
        String expected = "2025-08-21";
        P1507 solution = new P1507();
        String actual = solution.reformatDate(date);
        Assertions.assertEquals(expected, actual);
    }
}
