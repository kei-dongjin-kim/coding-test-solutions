package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0502Test {

    @Test
    @DisplayName("k = 2, w = 0, profits = [2,2,3], capital = [0,2,2]")
    void test1() {
        int k = 2;
        int w = 0;
        int[] profits = {2, 2, 3};
        int[] capital = {0, 2, 2};
        P0502 solution = new P0502();
        int actual = solution.findMaximizedCapital(k, w, profits, capital);
        assert actual == 5;
    }
}
