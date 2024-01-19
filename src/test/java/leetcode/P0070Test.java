package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0070Test {

    @Test
    @DisplayName("1")
    void climbStairs1() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(1) == 1);
    }

    @Test
    @DisplayName("2")
    void climbStairs2() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(2) == 2);
    }

    @Test
    @DisplayName("3")
    void climbStairs3() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(3) == 3);
    }

    @Test
    @DisplayName("4")
    void climbStairs4() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(4) == 5);
    }

    @Test
    @DisplayName("5")
    void climbStairs5() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(5) == 8);
    }

    @Test
    @DisplayName("6")
    void climbStairs6() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(6) == 13);
    }

    @Test
    @DisplayName("7")
    void climbStairs7() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(7) == 21);
    }

    @Test
    @DisplayName("8")
    void climbStairs8() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(8) == 34);
    }

    @Test
    @DisplayName("9")
    void climbStairs9() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(9) == 55);
    }

    @Test
    @DisplayName("10")
    void climbStairs10() {
        P0070 calculator = new P0070();
        assert (calculator.climbStairs(10) == 89);
    }
}
