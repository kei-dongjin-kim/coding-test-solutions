package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1598Test {

    @Test
    @DisplayName("logs = [d1/,d2/,d3/,../,d31/,d32]")
    void test1() {
        String[] logs = {"d1/", "d2/", "d3/", "../", "d31/", "d32"};
        P1598 solution = new P1598();
        int actual = solution.minOperations(logs);
        int expected = 4;
        assert expected == actual;
    }
}
