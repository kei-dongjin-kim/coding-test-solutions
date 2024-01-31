package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1137Test {

    @Test
    @DisplayName("n = 4")
    void tribonacci_Test1() {
        P1137 solution = new P1137();
        assert(4 == solution.tribonacci(4));
    }

    @Test
    @DisplayName("n = 25")
    void tribonacci_Test2() {
        P1137 solution = new P1137();
        assert(1389537 == solution.tribonacci(25));
    }
}
