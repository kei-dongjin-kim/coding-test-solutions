package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1984Test {
    
    @Test
    void test1() {
        int[] nums = new int[] {10, 20, 30, 40, 50, 1}; 
        int k = 3;
        int expected = 19;
        P1984 solution = new P1984();
        int actual = solution.minimumDifference(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
