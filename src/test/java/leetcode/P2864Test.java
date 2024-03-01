package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2864Test {

    @Test
    @DisplayName("s = 010")
    void maximumOddBinaryNumber_Test1() {
        String s = "010";
        String expected = "001";
        String actual = new P2864().maximumOddBinaryNumber(s);
        assert expected.equals(actual);
    }

    @Test
    @DisplayName("s = 0101")
    void maximumOddBinaryNumber_Test2() {
        String s = "0101";
        String expected = "1001";
        String actual = new P2864().maximumOddBinaryNumber(s);
        assert expected.equals(actual);
    }
}
