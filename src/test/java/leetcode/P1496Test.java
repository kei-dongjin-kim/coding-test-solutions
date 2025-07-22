package leetcode;

import org.junit.jupiter.api.Test;

public class P1496Test {

    @Test
    void test1() {
        String path = "NEWS";
        boolean expected = true;
        P1496 solution = new P1496();
        boolean actual = solution.isPathCrossing(path);
        assert expected == actual;
    }
}
