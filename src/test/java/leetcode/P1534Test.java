package leetcode;

import org.junit.jupiter.api.Test;

public class P1534Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 6, 9};
        int a = 3;
        int b = 3;
        int c = 3;
        int expected = 1;
        P1534 solution = new P1534();
        int actual = solution.countGoodTriplets(arr, a, b, c);
        assert expected == actual;
    }
}
