package leetcode;

import org.junit.jupiter.api.Test;

public class P2432Test {

    @Test
    void test1() {
        int n = 100;
        int[][] logs = new int[][] {{0, 10}, {1, 20}, {2, 40}, {3, 60}, {4, 80}};
        int expected = 2;
        P2432 solution = new P2432();
        int actual = solution.hardestWorker(n, logs);
        assert expected == actual;
    }
}
