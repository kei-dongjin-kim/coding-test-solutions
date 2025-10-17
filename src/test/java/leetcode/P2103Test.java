package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2103Test {

    @Test
    void test1() {
        String rings = "B1G1R1B2G3R4";
        int expected = 1;
        P2103 solution = new P2103();
        int actual = solution.countPoints(rings);
        Assertions.assertEquals(expected, actual);
    }
}
