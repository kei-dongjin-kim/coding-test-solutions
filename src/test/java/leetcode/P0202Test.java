package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0202Test {

    @Test
    @DisplayName("n = 23")
    void test1() {
        int n = 23;
        boolean expected = true;
        assert new P0202().isHappy(n) == expected;
    }
}
