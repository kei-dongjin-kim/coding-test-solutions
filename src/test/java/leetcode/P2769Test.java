package leetcode;

import org.junit.jupiter.api.Test;

public class P2769Test {

    @Test
    void test1() {
        int num = 10;
        int t = 1;
        int expected = 12;
        P2769 solution = new P2769();
        int actual = solution.theMaximumAchievableX(num, t);
        assert expected == actual;
    }
}
