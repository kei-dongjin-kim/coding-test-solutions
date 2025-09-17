package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2180Test {

    @Test
    void test1() {
        int num = 10;
        int expected = 4;
        P2180 solution = new P2180();
        int actual = solution.countEven(num);
        Assertions.assertEquals(expected, actual);
    }
}
