package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0476Test {

    @Test
    @DisplayName("num = 123")
    void test1() {
        int num = 123;
        int expected = 4;
        int actual = new P0476().findComplement(num);
        assert actual == expected;
    }
}
