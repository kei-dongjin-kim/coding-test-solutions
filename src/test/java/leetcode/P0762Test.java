package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0762Test {

    @Test
    void test1() {
        int left = 1;
        int right = 100;
        int expected = 65;
        P0762 solution = new P0762();
        int actual = solution.countPrimeSetBits(left, right);
        Assertions.assertEquals(expected, actual);
    }
}
