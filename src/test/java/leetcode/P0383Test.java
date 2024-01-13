package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P0383Test {

    @Test
    @DisplayName("ransomNote = aa, magazine = aab")
    void canConstruct() {
        P0383 p0383 = new P0383();
        assertEquals(true, p0383.canConstruct("aa", "aab"));
    }

    @Test
    @DisplayName("ransomNote = abcd, magazine = xyzabcd")
    void canConstruct2() {
        P0383 p0383 = new P0383();
        assertEquals(true, p0383.canConstruct("abcd", "xyzabcd"));
    }
}
