package leetcode;

import org.junit.jupiter.api.Test;

public class P3146Test {

    @Test
    void test1() {
        String s = "abc";
        String t = "bca";
        int expected = 4;
        P3146 solution = new P3146();
        int actual = solution.findPermutationDifference(s, t);
        assert expected == actual;
    }
}
