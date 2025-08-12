package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2566Test {

    @Test
    void test1() {
        int num = 123;
        int expected = 923 - 23;
        P2566 solution = new P2566();
        int actual = solution.minMaxDifference(num);
        Assertions.assertEquals(expected, actual);
    }
}
