package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0005Test {

    @Test
    @DisplayName("s = babad")
    void longestPalindrome_Test1() {
        P0005 solution = new P0005();
        assert(solution.longestPalindrome("babad").equals("bab"));
    }

    @Test
    @DisplayName("s = cbbd")
    void longestPalindrome_Test2() {
        P0005 solution = new P0005();
        assert(solution.longestPalindrome("cbbd").equals("bb"));
    }
}
