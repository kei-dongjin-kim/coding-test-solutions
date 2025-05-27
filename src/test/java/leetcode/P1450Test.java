package leetcode;

import org.junit.jupiter.api.Test;

public class P1450Test {

    @Test
    void test1() {
        int[] startTime = new int[] {1, 2, 3, 4, 5};
        int[] endTime = new int[] {3, 4, 5, 6, 7};
        int queryTime = 5;
        int expected = 3;
        P1450 solution = new P1450();
        int actual = solution.busyStudent(startTime, endTime, queryTime);
        assert expected == actual;
    }
}
