package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0682Test {

    @Test
    void test1() {
        String[] operations = new String[] {"4", "5", "C", "3", "+", "D"};
        int expected = 28;
        P0682 solution = new P0682();
        int actual = solution.calPoints(operations);
        Assertions.assertEquals(expected, actual);
    }
}
