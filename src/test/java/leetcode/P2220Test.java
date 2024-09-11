package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2220Test {

    @Test
    @DisplayName("start = 8, goal = 0")
    void test1() {
        int start = 8;
        int goal = 0;
        int expected = 1;
        int actual = new P2220().minBitFlips(start, goal);
        assert actual == expected;
    }
}
