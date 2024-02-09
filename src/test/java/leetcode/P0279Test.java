package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0279Test {

    @Test
    @DisplayName("n = 12")
    void numSquares_Test1() {
        int n = 12;
        int expected = 3;
        int result = new P0279().numSquares(n);
        assert expected == result;
    }

    @Test
    @DisplayName("n = 13")
    void numSquares_Test2() {
        int n = 13;
        int expected = 2;
        int result = new P0279().numSquares(n);
        assert expected == result;
    }
}
