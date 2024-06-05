package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0409Test {

    @Test
    @DisplayName("s = abccccdd")
    void test1() {
        String s = "abccccdd";
        int expected = 7;
        assert new P0409().longestPalindrome(s) == expected;
    }
}
