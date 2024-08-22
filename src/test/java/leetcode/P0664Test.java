package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0664Test {

    @Test
    @DisplayName("s = abcabc")
    void test1() {
        String s = "abcabc";
        int expected = 5;
        assert expected == new P0664().strangePrinter(s);
    }
}
