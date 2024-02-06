package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0326Test {

    @Test
    @DisplayName("n = 27")
    void isPowerOfThree_Test1() {
        assert new P0326().isPowerOfThree(27);
    }

    @Test
    @DisplayName("n = 0")
    void isPowerOfThree_Test2() {
        assert !new P0326().isPowerOfThree(0);
    }

    @Test
    @DisplayName("n = 9")
    void isPowerOfThree_Test3() {
        assert new P0326().isPowerOfThree(9);
    }
}
