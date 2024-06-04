package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2486Test {

    @Test
    @DisplayName("s = coaching, t = coding")
    void test1() {
        P2486 solution = new P2486();
        int actual = solution.appendCharacters("coaching", "coding");
        int expected = 4;
        assert actual == expected;
    }
}
