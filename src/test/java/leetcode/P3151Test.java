package leetcode;

import org.junit.jupiter.api.Test;

public class P3151Test {

    @Test
    void test1() {
        int[] nums = new int[]  {1, 2, 3, 4, 5};
        boolean expected = true;
        P3151 solution = new P3151();
        boolean actual = solution.isArraySpecial(nums);
        assert expected == actual;
    }
}
