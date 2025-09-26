package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3206Test {

    @Test
    void test1() {
        int[] colors = new int[] {1, 0, 1, 0, 1, 0};
        int expected = 6;
        P3206 solution = new P3206();
        int actual = solution.numberOfAlternatingGroups(colors);
        Assertions.assertEquals(expected, actual);
    }
}
