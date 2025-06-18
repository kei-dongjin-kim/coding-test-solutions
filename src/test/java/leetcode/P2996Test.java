package leetcode;

import org.junit.jupiter.api.Test;

public class P2996Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 15, 16, 17, 18, 19, 21};
        int expected = 20;
        P2996 solution = new P2996();
        int actual = solution.missingInteger(nums);
        assert actual == expected;
    }
}
