package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2191Test {

    @Test
    @DisplayName("mapping = [4,3,2,1,0], nums = [0,1,2,3,4]")
    void test1() {
        int[] mapping = {4,3,2,1,0};
        int[] nums = {0,1,2,3,4};
        P2191 solution = new P2191();
        int[] actual = solution.sortJumbled(mapping, nums);
        int[] expected = {4,3,2,1,0};
        assert Arrays.equals(actual, expected);
    }
}
