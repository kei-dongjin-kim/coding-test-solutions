package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2437Test {

    @Test
    void test1() {
        String time = "??:00";
        int expected = 24;
        P2437 solution = new P2437();
        int actual = solution.countTime(time);
        Assertions.assertEquals(expected, actual);
    }
}
