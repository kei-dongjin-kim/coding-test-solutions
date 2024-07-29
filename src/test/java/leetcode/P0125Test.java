package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0125Test {

    @Test
    @DisplayName("s = abcba")
    void test1() {
        String s = "abcba";
        assert new P0125().isPalindrome(s);
    }

    @Test
    @DisplayName("s = abcd")
    void test2() {
        String s = "abcd";
        assert !new P0125().isPalindrome(s);
    }
}
