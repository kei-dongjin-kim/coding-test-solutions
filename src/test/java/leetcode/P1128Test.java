package leetcode;

import org.junit.jupiter.api.Test;

public class P1128Test {

    @Test
    void test1() {
        int[][] dominoes = new int[][] {{1, 2}, {2, 1}, {1, 2}, {3, 4}, {4, 3}, {3, 4}, {5, 6}};
        int expected = 6;
        P1128 solution = new P1128();
        int actual = solution.numEquivDominoPairs(dominoes);
        assert expected == actual;
    }
}
