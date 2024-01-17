package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P0380Test {

    @Test
    @DisplayName("Test Random")
    void testRandom() {
        P0380 p0380 = new P0380();
        assertEquals(true, p0380.insert(1));
        assertEquals(false, p0380.remove(2));
        assertEquals(true, p0380.insert(2));
        int result = p0380.getRandom();
        assertEquals(true, result == 1 || result == 2);
        assertEquals(true, p0380.remove(1));
        assertEquals(false, p0380.insert(2));
        assertEquals(2, p0380.getRandom());
    }
}
