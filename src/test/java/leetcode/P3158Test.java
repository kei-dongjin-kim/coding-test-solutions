package leetcode;

import org.junit.jupiter.api.Test;

public class P3158Test {

    @Test
    void test1() {
        int[] nums = {3, 3, 5, 7, 7};
        int expected = 4;
        P3158 solution = new P3158();
        int actual = solution.duplicateNumbersXOR(nums);
        assert expected == actual;
    }
}
