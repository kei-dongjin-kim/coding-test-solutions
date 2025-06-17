package leetcode;

import org.junit.jupiter.api.Test;

public class P2399Test {

    @Test
    void test1() {
        String s = "edabaccbde";
        int[] distance = new int[] {1, 3, 0, 6, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean expected = true;
        P2399 solution = new P2399();
        boolean actual = solution.checkDistances(s, distance);
        assert expected == actual;
    }
}
