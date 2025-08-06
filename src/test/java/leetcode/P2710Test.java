package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2710Test {

    @Test
    void test1() {
        String num = "10";
        String expected = "1";
        P2710 solution = new P2710();
        String actual = solution.removeTrailingZeros(num);
        Assertions.assertEquals(expected, actual);
    }
}
