package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1717Test {

    @Test
    @DisplayName("s = ababab, x = 1, y = 10, Output = 21")
    void test1() {
        String s = "ababab";
        int x = 1;
        int y = 10;
        int expected = 21;
        int actual = new P1717().maximumGain(s, x, y);
        assert expected == actual;
    }

}
