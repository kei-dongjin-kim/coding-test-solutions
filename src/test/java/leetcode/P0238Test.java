package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P0238Test {

    @Test
    @DisplayName("nums = [1,2,3,4]")
    void productExceptSelf_Test1() {
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};
        P0238 solution = new P0238();
        int[] actual = solution.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}
