package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1941Test {

    @Test
    @DisplayName("s = abacbc, Output: true")
    void areOccurrencesEqual_Test1() {
        String s = "abacbc";
        boolean expected = true;
        assert new P1941().areOccurrencesEqual(s) == expected;
    }

    @Test
    @DisplayName("s = aaabb, Output: false")
    void areOccurrencesEqual_Test2() {
        String s = "aaabb";
        boolean expected = false;
        assert new P1941().areOccurrencesEqual(s) == expected;
    }
}
