package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0338Test {

    @Test
    @DisplayName("2")
    void testCountBits1() {
        int[] expected = {0, 1, 1};
        P0338 solution = new P0338();
        assert Arrays.equals(expected, solution.countBits(2));
    }

    @Test
    @DisplayName("5")
    void testCountBits2() {
        int[] expected = {0, 1, 1, 2, 1, 2};
        P0338 solution = new P0338();
        assert Arrays.equals(expected, solution.countBits(5));
    }
}
