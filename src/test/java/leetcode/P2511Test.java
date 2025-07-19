package leetcode;

import org.junit.jupiter.api.Test;

public class P2511Test {

    @Test
    void test1() {
        int[] forts = new int[] {0, 1, 0, -1, 0, 0, 0, 1, 0};
        int expected = 3;
        P2511 solution = new P2511();
        int actual = solution.captureForts(forts);
        assert expected == actual;
    }
}
