package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0633Test {

    @Test
    @DisplayName("c = 5")
    void test1() {
        int c = 5;
        P0633 solution = new P0633();
        assert solution.judgeSquareSum(c);
    }

    @Test
    @DisplayName("c = 3")
    void test2() {
        int c = 3;
        P0633 solution = new P0633();
        assert !solution.judgeSquareSum(c);
    }
}
