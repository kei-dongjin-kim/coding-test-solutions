package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2028Test {

    @Test
    @DisplayName("rolls = [1,1,1,1], mean = 6, n = 2")
    void test1() {
        int[] rolls = {1, 1, 1, 1};
        int mean = 1;
        int n = 2;
        int[] expected = {1, 1};
        int[] actual = new P2028().missingRolls(rolls, mean, n);
        Arrays.sort(actual);
        Arrays.sort(expected);
        for (int i = 0; i < expected.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
