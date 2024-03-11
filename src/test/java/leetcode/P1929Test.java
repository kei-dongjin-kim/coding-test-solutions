package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1929Test {

    @Test
    @DisplayName("nums = [1,2,1]")
    void getConcatenation_Test1() {
        int[] nums = {1, 2, 1};
        P1929 solution = new P1929();
        int[] actual = solution.getConcatenation(nums);
        int[] expected = {1, 2, 1, 1, 2, 1};
        assert Arrays.equals(actual, expected);
    }
}
