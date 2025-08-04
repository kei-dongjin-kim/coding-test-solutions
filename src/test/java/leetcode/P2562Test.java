package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2562Test {

    @Test
    void test1() {
        int[] nums = new int[] {3, 4, 5, 6, 7};
        long expected = 88L;
        P2562 solution = new P2562();
        long actual = solution.findTheArrayConcVal(nums);
        Assertions.assertEquals(expected, actual);
    }
}
