package leetcode;

import org.junit.jupiter.api.Test;

public class P1221Test {

    @Test
    void test1() {
        String s = "RLRRLLRLRLRL";
        int expected = 5;
        P1221 solution = new P1221();
        int actual = solution.balancedStringSplit(s);
        assert expected == actual;
    }
}
