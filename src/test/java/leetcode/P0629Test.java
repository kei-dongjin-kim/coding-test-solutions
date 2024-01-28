package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0629Test {

    @Test
    @DisplayName("n = 3, k = 0")
    void kInversePairs1() {
        P0629 solution = new P0629();
        assert solution.kInversePairs(3, 0) == 1;
    }

    @Test
    @DisplayName("n = 3, k = 1")
    void kInversePairs2() {
        P0629 solution = new P0629();
        assert solution.kInversePairs(3, 1) == 2;
    }

    @Test
    @DisplayName("n = 3, k = 2")
    void kInversePairs3() {
        P0629 solution = new P0629();
        assert solution.kInversePairs(3, 2) == 2;
    }

    @Test
    @DisplayName("n = 1000, k = 1000")
    void kInversePairs4() {
        P0629 solution = new P0629();
        assert solution.kInversePairs(1000, 1000) == 663677020;
    }
}
