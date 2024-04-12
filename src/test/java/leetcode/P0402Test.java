package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0402Test {

    @Test
    @DisplayName("num = 112, k = 1")
    void test1() {
        String num = "112";
        int k = 1;
        String expected = "11";
        assert expected.equals(new P0402().removeKdigits(num, k));
    }

    @Test
    @DisplayName("num = 1234567890, k = 9")
    void test2() {
        String num = "1234567890";
        int k = 9;
        String expected = "0";
        assert expected.equals(new P0402().removeKdigits(num, k));
    }

    @Test
    @DisplayName("num = 1432219, k = 3")
    void test3() {
        String num = "1432219";
        int k = 3;
        String expected = "1219";
        assert expected.equals(new P0402().removeKdigits(num, k));
    }

    @Test
    @DisplayName("num = 10001, k = 4")
    void test4() {
        String num = "10001";
        int k = 4;
        String expected = "0";
        assert expected.equals(new P0402().removeKdigits(num, k));
    }
}
