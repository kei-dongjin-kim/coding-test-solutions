package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0020Test {

    @Test
    @DisplayName("()[]{}")
    void isValid1() {
        P0020 calculator = new P0020();
        assert calculator.isValid("()[]{}");
    }
}
