package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1404Test {

    @Test
    @DisplayName("s = 1101")
    void test1() {
        String s = "1101";
        int expected = 6;
        int actual = new P1404().numSteps(s);
        assert actual == expected;
    }
}
