package leetcode;

import org.junit.jupiter.api.Test;

public class P1394Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6};
        int expected = 5;
        P1394 solution = new P1394();
        int actual = solution.findLucky(arr);
        assert expected == actual;
    }
}
