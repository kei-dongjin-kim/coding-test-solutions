package leetcode;

import org.junit.jupiter.api.Test;

public class P2506Test {

    @Test
    void test1() {
        String[] words = new String[] {"abc", "abcd", "abcde", "aabbcc"};
        int expected = 1;
        P2506 solution = new P2506();
        int actual = solution.similarPairs(words);
        assert expected == actual;
    }
}
