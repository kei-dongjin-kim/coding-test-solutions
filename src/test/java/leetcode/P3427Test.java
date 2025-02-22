package leetcode;

import org.junit.jupiter.api.Test;

public class P3427Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int expected = 84;
        P3427 solution = new P3427();
        int actual = solution.subarraySum(nums);
        System.out.println(actual);
        assert expected == actual;
    }
}
