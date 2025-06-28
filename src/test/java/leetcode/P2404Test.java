package leetcode;

import org.junit.jupiter.api.Test;

public class P2404Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};
        int expected = 8;
        P2404 solution = new P2404();
        int actual = solution.mostFrequentEven(nums);
        assert expected == actual;
    }
}
