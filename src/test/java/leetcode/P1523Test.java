package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1523Test {

    @Test
    void test1() {
        int low = 3;
        int high = 5;
        int expected = 2;
        P1523 solution = new P1523();
        int actual = solution.countOdds(low, high);
        assert expected == actual;
    }
}
