package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1518Test {

    @Test
    @DisplayName("numBottles = 10, numExchange = 3")
    void test1() {
        int numBottles = 10;
        int numExchange = 3;
        int expected = 14;
        int actual = new P1518().numWaterBottles(numBottles, numExchange);
        assert actual == expected;
    }
}
