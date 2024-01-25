package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0121Test {

    @Test
    @DisplayName("prices = {7,1,5,3,6,4}")
    void testMaxProfit1() {
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;

        P0121 solution = new P0121();
        int actual = solution.maxProfit(prices);
        assert(expected == actual);
    }

    @Test
    @DisplayName("prices = {7,6,4,3,1}")
    void testMaxProfit2() {
        int[] prices = {7,6,4,3,1};
        int expected = 0;

        P0121 solution = new P0121();
        int actual = solution.maxProfit(prices);
        assert(expected == actual);
    }
}
