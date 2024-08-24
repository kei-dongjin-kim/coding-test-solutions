package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0564Test {

    @Test
    @DisplayName("n = 139")
    void test1() {
        String n = "139";
        P0564 solution = new P0564();
        String expected = "141";
        String actual = solution.nearestPalindromic(n);
        assert(expected.equals(actual));
    }
}
