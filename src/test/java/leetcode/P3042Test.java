package leetcode;

import org.junit.jupiter.api.Test;

public class P3042Test {

    @Test
    void test1() {
        String[] words = {"abcde", "abcdexxxabcde", "xxx"};
        int expected = 1;
        P3042 solution = new P3042();
        int actual = solution.countPrefixSuffixPairs(words);
        assert expected == actual;
    }

    @Test
    void test2() {
        String[] words = {"xxx", "yyy", "zzz"};
        int expected = 0;
        P3042 solution = new P3042();
        int actual = solution.countPrefixSuffixPairs(words);
        assert expected == actual;
    }
}
