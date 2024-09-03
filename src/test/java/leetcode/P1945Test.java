package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1945Test {

    @Test
    @DisplayName("s = cccc, k = 2")
    void test1() {
        String s = "cccc";
        int k = 2;
        int expected = 3;
        int actual = new P1945().getLucky(s, k);
        assert expected == actual;
    }
}
