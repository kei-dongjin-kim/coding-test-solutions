package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0509Test {

    @Test
    @DisplayName("n = 2")
    void fib1() {
        P0509 solution = new P0509();
        assert(1 == solution.fib(2));
    }

    @Test
    @DisplayName("n = 3")
    void fib2() {
        P0509 solution = new P0509();
        assert(2 == solution.fib(3));
    }

    @Test
    @DisplayName("n = 4")
    void fib3() {
        P0509 solution = new P0509();
        assert(3 == solution.fib(4));
    }
}
