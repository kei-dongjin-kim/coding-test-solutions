package leetcode;

import org.junit.jupiter.api.Test;

public class P3502Test {

    @Test
    void test1() {
        int[] cost = {3, 2, 1, 2, 3};
        int[] expected = {3, 2, 1, 1, 1};
        P3502 solution = new P3502();
        int[] actual = solution.minCosts(cost);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
