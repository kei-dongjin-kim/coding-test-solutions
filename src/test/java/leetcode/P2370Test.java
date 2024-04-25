package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2370Test {

    @Test
    @DisplayName("s = acfgbd, k = 2")
    void test1() {
        String s = "acfgbd";
        int k = 2;
        int expected = 4;
        int actual = new P2370().longestIdealString(s, k);
        assert actual == expected;
    }
}
