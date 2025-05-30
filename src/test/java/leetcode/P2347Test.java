package leetcode;

import org.junit.jupiter.api.Test;

public class P2347Test {

    @Test
    void test1() {
        int[] ranks = new int[] {1, 2, 3, 4, 5};
        char[] suits = new char[] {'a', 'b', 'c', 'd'};
        String expected = "High Card";
        P2347 solution = new P2347();
        String actual = solution.bestHand(ranks, suits);
        assert expected.equals(actual);
    }
}
