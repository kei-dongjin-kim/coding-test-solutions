package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2591Test {

    @Test
    void test1() {
        int money = 100;
        int children = 10;
        int expected = 9;
        P2591 solution = new P2591();
        int actual = solution.distMoney(money, children);
        Assertions.assertEquals(expected, actual);
    }
}
