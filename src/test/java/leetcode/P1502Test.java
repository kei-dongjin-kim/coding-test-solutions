package leetcode;

import org.junit.jupiter.api.Test;

public class P1502Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean expected = true;
        P1502 solution = new P1502();
        boolean actual = solution.canMakeArithmeticProgression(arr);
        assert expected == actual;
    }
}
