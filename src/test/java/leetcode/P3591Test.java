package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class P3591Test {

    @Test
    void test1() {
        int[] nums = new int[] {2, 3, 5, 7, 2};
        boolean expected = true;
        P3591 solution  = new P3591();
        boolean actual = solution.checkPrimeFrequency(nums);
        Assertions.assertEquals(expected, actual);
    }
}
