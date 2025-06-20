package leetcode;

import org.junit.jupiter.api.Test;

public class P2748Test {

    @Test
    void test1() {
        int[] nums = new int[] {11, 22, 33, 44, 55};
        int expected = 9;
        P2748 solution = new P2748();
        int actual = solution.countBeautifulPairs(nums);
        assert expected == actual;
    }
}
