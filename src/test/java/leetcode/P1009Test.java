package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1009Test {

    @Test
    @DisplayName("n = 123")
    void test1() {
        int n = 123;
        int expected = 4;
        int actual = new P1009().bitwiseComplement(n);
        assert actual == expected;
    }
}
