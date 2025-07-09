package leetcode;

import org.junit.jupiter.api.Test;

public class P0575Test {

    @Test
    void test1() {
        int[] candyType = new int[] {1, 2, 3, 3, 3, 3, 3, 3};
        int expected = 3;
        P0575 solution = new P0575();
        int actual = solution.distributeCandies(candyType);
        assert expected == actual;
    }
}
