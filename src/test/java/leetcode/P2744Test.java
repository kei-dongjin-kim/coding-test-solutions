package leetcode;

import org.junit.jupiter.api.Test;

public class P2744Test {

    @Test
    void test1() {
        String[] words = {"xy", "za", "yx"};
        int expected = 1;
        P2744 solution = new P2744();
        int actual = solution.maximumNumberOfStringPairs(words);
        assert expected == actual;
    }
}
