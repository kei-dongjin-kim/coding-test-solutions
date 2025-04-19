package leetcode;

import org.junit.jupiter.api.Test;

public class P3432Test {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};
        int expected = 3;
        P3432 solution = new P3432();
        int actual = solution.countPartitions(nums);
        assert expected == actual;
    }
}
