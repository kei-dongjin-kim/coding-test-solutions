package leetcode;

import org.junit.jupiter.api.Test;

public class P2315Test {

    @Test
    void test1() {
        String s = "test****|test****|test****";
        int expected = 8;
        P2315 solution = new P2315();
        int actual = solution.countAsterisks(s);
        assert expected == actual;
    }
}
