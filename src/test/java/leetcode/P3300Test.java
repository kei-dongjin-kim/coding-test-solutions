package leetcode;

import org.junit.jupiter.api.Test;

public class P3300Test {

    @Test
    void test1() {
        int[] nums = new int[] {12, 34, 56, 78, 90, 100};
        int expected = 1;
        P3300 solution = new P3300();
        int actual = solution.minElement(nums);
        assert expected == actual;
    }
}
