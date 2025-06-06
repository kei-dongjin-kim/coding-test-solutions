package leetcode;

import org.junit.jupiter.api.Test;

public class P1897Test {

    @Test
    void test1() {
        String[] words = new String[] {"aaa", "bbb", "ccc"};
        boolean expected = true;
        P1897 solution = new P1897();
        boolean actual = solution.makeEqual(words);
        assert expected == actual;
    }
}
