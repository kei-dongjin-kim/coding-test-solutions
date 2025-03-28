package leetcode;

import org.junit.jupiter.api.Test;

public class P1732Test {

    @Test
    void test1() {
        int[] gain = new int[] {-1, 2, -3, 4, -5};
        int expected = 2;
        P1732 solution = new P1732();
        int actual = solution.largestAltitude(gain);
        assert expected == actual;
    }
}
