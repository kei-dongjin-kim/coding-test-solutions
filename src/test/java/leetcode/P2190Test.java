package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2190Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 7, 1, 7, 1, 3, 1, 4, 1, 5, 1, 6};
        int key = 1;
        int expected = 7;
        P2190 solution = new P2190();
        int actual = solution.mostFrequent(nums, key);
        Assertions.assertEquals(expected, actual);
    }
}
