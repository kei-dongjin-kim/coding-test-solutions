package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P1636Test {

    @Test
    @DisplayName("nums = [1,2,2,3,3,3,4,4,4]")
    void test1() {
        int[] nums = {1,2,2,3,3,3,4,4,4};
        P1636 solution = new P1636();
        int[] actual = solution.frequencySort(nums);
        System.out.println(Arrays.toString(actual));
        int[] expected = {1, 2, 2, 4, 4, 4, 3, 3, 3};
        assert Arrays.equals(expected, actual);
    }
}
