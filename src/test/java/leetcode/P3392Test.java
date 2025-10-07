package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3392Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 32, 9};
        int expected = 1;
        P3392 solution = new P3392();
        int actual = solution.countSubarrays(nums);
        Assertions.assertEquals(expected, actual);
    }
}
