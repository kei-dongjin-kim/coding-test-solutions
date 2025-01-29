package leetcode;

import org.junit.jupiter.api.Test;

public class P2798Test {

    @Test
    void test1() {
        int[] hours = new int[] {1, 2, 3, 4, 5};
        int target = 3;
        int expected = 3;
        P2798 solution = new P2798();
        int actual = solution.numberOfEmployeesWhoMetTarget(hours, target);
        assert expected == actual;
    }
}
