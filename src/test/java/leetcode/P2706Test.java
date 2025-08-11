package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P2706Test {

    @Test
    void test1() {
        int[] prices = new int[] {1, 1, 1, 1, 1};
        int money = 5;
        int expected = 3;
        P2706 solution = new P2706();
        int actual = solution.buyChoco(prices, money);
        Assertions.assertEquals(expected, actual);
    }
}
