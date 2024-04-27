package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0514Test {

    @Test
    @DisplayName("ring = godding, key = gd")
    void test1() {
        String ring = "godding";
        String key = "gd";
        int expected = 4;
        int actual = new P0514().findRotateSteps(ring, key);
        assert actual == expected;
    }
}
