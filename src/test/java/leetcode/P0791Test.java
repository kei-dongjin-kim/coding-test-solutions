package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0791Test {

    @Test
    @DisplayName("order = cba, s = abcd")
    void customSortString_Test1() {
        String order = "cba";
        String s = "abcd";
        String expected = "cbad";
        String actual = new P0791().customSortString(order, s);
        assert expected.equals(actual);
    }
}
