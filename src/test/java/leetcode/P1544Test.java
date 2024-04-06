package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1544Test {

    @Test
    @DisplayName("s = abBAcC")
    void makeGood_Test1() {
        P1544 solution = new P1544();
        String s = "abBAcC";
        String expected = "";
        assert solution.makeGood(s).equals(expected);
    }
}
