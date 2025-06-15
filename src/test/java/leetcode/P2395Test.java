package leetcode;

import org.junit.jupiter.api.Test;

public class P2395Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 1, 2};
        boolean expected = true;
        P2395 solution = new P2395();
        boolean actual = solution.findSubarrays(nums);
        assert expected == actual;
    }
}
