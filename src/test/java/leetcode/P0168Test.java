package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0168Test {

    @Test
    @DisplayName("1")
    void test1() {
        int columnNumber = 1;
        String expected = "A";
        assert new P0168().convertToTitle(columnNumber).equals(expected);
    }

    @Test
    @DisplayName("26")
    void test2() {
        int columnNumber = 26;
        String expected = "Z";
        assert new P0168().convertToTitle(columnNumber).equals(expected);
    }

    @Test
    @DisplayName("52")
    void test3() {
        int columnNumber = 52;
        String expected = "AZ";
        assert new P0168().convertToTitle(columnNumber).equals(expected);
    }
}
