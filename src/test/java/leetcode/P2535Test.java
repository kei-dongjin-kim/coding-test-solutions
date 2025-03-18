package leetcode;

import org.junit.jupiter.api.Test;

public class P2535Test {

    @Test
    void test1() {
        int[] nums = new int[] {12, 34, 56, 78, 90};
        int expected = 225;
        P2535 solution = new P2535();
        int actual = solution.differenceOfSum(nums);
        assert expected == actual;
    }
}
