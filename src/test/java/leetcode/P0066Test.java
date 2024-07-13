package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0066Test {

    @Test
    @DisplayName("digits = [1,9,9,9]")
    void test1() {
        int[] digits = {1, 9, 9, 9};
        int[] expected = {2, 0, 0, 0};
        int[] actual = new P0066().plusOne(digits);
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
