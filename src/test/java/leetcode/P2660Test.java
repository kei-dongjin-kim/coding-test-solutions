package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2660Test {

    @Test
    void test1() {
        int[] player1 = new int[] {1, 2, 10, 3, 4, 5};
        int[] player2 = new int[] {1, 2, 3, 10, 4, 5};
        int expected = 2;
        P2660 solution = new P2660();
        int actual = solution.isWinner(player1, player2);
        Assertions.assertEquals(expected, actual);
    }
}
