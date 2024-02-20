package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0231Test {

    @Test
    @DisplayName("n = 1")
    void isPowerOfTwo_Test1() {
        int n = 1;
        boolean expected = true;
        assert new P0231().isPowerOfTwo(n) == expected;
    }

    @Test
    @DisplayName("n = 16")
    void isPowerOfTwo_Test2() {
        int n = 16;
        boolean expected = true;
        assert new P0231().isPowerOfTwo(n) == expected;
    }

    @Test
    @DisplayName("n = 3")
    void isPowerOfTwo_Test3() {
        int n = 3;
        boolean expected = false;
        assert new P0231().isPowerOfTwo(n) == expected;
    }
}
