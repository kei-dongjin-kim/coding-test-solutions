package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2485Test {

    @Test
    @DisplayName("n = 8")
    void pivotInteger_Test1() {
        int n = 8;
        int expected = 6;
        P2485 solution = new P2485();
        int actual = solution.pivotInteger(n);
        assert (actual == expected);
    }
}
