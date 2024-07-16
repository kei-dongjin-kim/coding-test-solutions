package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0067Test {

    @Test
    @DisplayName("a = 1111, b = 11")
    void test1() {
        String a = "1111";
        String b = "11";
        String expected = "10010";
        String actual = new P0067().addBinary(a, b);
        assert(expected.equals(actual));
    }
}
