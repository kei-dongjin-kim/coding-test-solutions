package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0977Test {

    @Test
    @DisplayName("nums = [-4,-1,0,3,10]")
    void sortedSquares_Test1() {
        int[] nums = {-4,-1,0,3,10};
        int[] expected = {0,1,9,16,100};
        P0977 solution = new P0977();
        int[] actual = solution.sortedSquares(nums);
        assert Arrays.equals(expected, actual);
    }
}
