package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P2974Test {

    @Test
    @DisplayName("nums = [5,4,2,3]")
    void numberGame_Test1() {
        int[] nums = {5, 4, 2, 3};
        int[] expected = {3, 2, 5, 4};
        P2974 solution = new P2974();
        int[] actual = solution.numberGame(nums);
        assertArrayEquals(expected, actual);
    }
}
