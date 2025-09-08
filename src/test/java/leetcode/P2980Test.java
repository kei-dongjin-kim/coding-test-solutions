package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2980Test {

    @Test
    void test1() {
        int[] nums = new int[] {3, 4, 5, 6, 7};
        boolean expected = true;
        P2980 solution = new P2980();
        boolean actual = solution.hasTrailingZeros(nums);
        Assertions.assertEquals(expected, actual);
    }
}
