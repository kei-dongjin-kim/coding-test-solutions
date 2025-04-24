package leetcode;

import org.junit.jupiter.api.Test;

public class P1287Test {

    @Test
    void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};
        int expected = 8;
        P1287 solution = new P1287();
        int actual = solution.findSpecialInteger(arr);
        assert expected == actual;
    }
}
