package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1347Test {

    @Test
    @DisplayName("s = bab, t = aba")
    void minSteps1() {
        P1347 calculator = new P1347();
        assertEquals(1, calculator.minSteps("bab", "aba"));
    }

    @Test
    @DisplayName("s = leetcode, t = practice")
    void minSteps2() {
        P1347 calculator = new P1347();
        assertEquals(5, calculator.minSteps("leetcode", "practice"));
    }

    @Test
    @DisplayName("s = anagram, t = mangaar")
    void minSteps3() {
        P1347 calculator = new P1347();
        assertEquals(0, calculator.minSteps("anagram", "mangaar"));
    }
}
