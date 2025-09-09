package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3216Test {

    @Test
    void test1() {
        String s = "76954321";
        String expected = "76594321";
        P3216 solution = new P3216();
        String actual = solution.getSmallestString(s);
        Assertions.assertEquals(expected, actual);
    }
}
