package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2231Test {

    @Test
    @DisplayName("num = 1234")
    void largestInteger_Test1() {
        int num = 1234;
        P2231 solution = new P2231();
        int result = solution.largestInteger(num);
        assert result == 3412;
    }

    @Test
    @DisplayName("num = 65875")
    void largestInteger_Test2() {
        int num = 65875;
        P2231 solution = new P2231();
        int result = solution.largestInteger(num);
        assert result == 87655;
    }
}
