package leetcode;

import org.junit.jupiter.api.Test;

public class P1539Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2};
        int k = 3;
        int expected = 5;
        P1539 solution = new P1539();
        int actual = solution.findKthPositive(arr, k);
        assert expected == actual;
    }
}
