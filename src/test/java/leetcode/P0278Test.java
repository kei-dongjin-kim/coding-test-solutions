package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0278Test {

    @Test
    @DisplayName("n = 5, badVersion = 4")
    public void test1() {
        int expected = 4;
        P0278 solution = new P0278(expected);
        int actual = solution.firstBadVersion(5);
        assert expected == actual;
    }
}
