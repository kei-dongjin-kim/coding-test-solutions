package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P3110Test {

    @Test
    @DisplayName("s = abc")
    void test1() {
        P3110 solution = new P3110();
        int actual = solution.scoreOfString("abc");
        assert actual == 2;
    }
}
