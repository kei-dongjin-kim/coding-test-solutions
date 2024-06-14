package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0945Test {

    @Test
    @DisplayName("nums = [1,2,3,3]")
    void test1() {
        int[] nums = {1, 2, 3, 3};
        int expected = 1;
        assert new P0945().minIncrementForUnique(nums) == expected;
    }

    // How about this test case?
//    @Test
//    @DisplayName("nums = [5,5,5,5,5,7,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,26,28,29,30]")
//    void test2() {
//        int[] nums = {5,5,5,5,5,7,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,26,28,29,30};
//        int expected = 11;
//        int actual = new P0945().minIncrementForUnique(nums);
//        assert actual == expected;
//    }
}
