package leetcode;

import org.junit.jupiter.api.Test;

public class P2379Test {

    @Test
    void test1() {
        String blocks = "WWBBBWBWWWBWBBWWWBWB";
        int k = 5;
        int expected = 1;
        P2379 solution = new P2379();
        int actual = solution.minimumRecolors(blocks, k);
        assert expected == actual;
    }
}
