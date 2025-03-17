package leetcode;

import org.junit.jupiter.api.Test;

public class P3194Test {

    @Test
    void test1() {
        int[] nums = new int[] {64, 32, 16, 8, 4, 2, 1};
        double expected = 10d;
        P3194 solution = new P3194();
        double actual = solution.minimumAverage(nums);
        assert expected == actual;
    }
}
