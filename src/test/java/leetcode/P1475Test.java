package leetcode;

import org.junit.jupiter.api.Test;

public class P1475Test {

    @Test
    void test1() {
        int[] prices = new int[] {5, 4, 3, 2, 1};
        int[] expected = new int[] {1, 1, 1, 1, 1};
        P1475 solution = new P1475();
        int[] actual = solution.finalPrices(prices);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
