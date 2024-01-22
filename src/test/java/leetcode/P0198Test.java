package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P0198Test {

    @Test
    @DisplayName("[1,2,3,1]")
    void rob1() {
        int[] nums = {1,2,3,1};
        P0198 solution = new P0198();
        int expected = 4;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[2,7,9,3,1]")
    void rob2() {
        int[] nums = {2,7,9,3,1};
        P0198 solution = new P0198();
        int expected = 12;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[2,1,1,2]")
    void rob3() {
        int[] nums = {2,1,1,2};
        P0198 solution = new P0198();
        int expected = 4;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[6,10,6]")
    void rob4() {
        int[] nums = {6,10,6};
        P0198 solution = new P0198();
        int expected = 12;
        int actual = solution.rob(nums);
        assertEquals(expected, actual);
    }
}
