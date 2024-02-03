package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0027Test {

    @Test
    @DisplayName("nums = [3,2,2,3], val = 3")
    void removeElement_Test1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        int actual = new P0027().removeElement(nums, val);
        assert expected == actual;
    }

    @Test
    @DisplayName("nums = [0,1,2,2,3,0,4,2], val = 2")
    void removeElement_Test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expected = 5;
        int actual = new P0027().removeElement(nums, val);
        assert expected == actual;
    }
}
