package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1025Test {

    @Test
    @DisplayName("n = 2")
    void divisorGame_Test1() {
        P1025 solution = new P1025();
        assert solution.divisorGame(2);
    }

    @Test
    @DisplayName("n = 3")
    void divisorGame_Test2() {
        P1025 solution = new P1025();
        assert !solution.divisorGame(3);
    }
}
