package leetcode;

import org.junit.jupiter.api.Test;

public class P1967Test {

    @Test
    void test1() {
        String[] patterns = {"a", "b", "c"};
        String word = "ab";
        int expected = 2;
        P1967 solution = new P1967();
        int actual = solution.numOfStrings(patterns, word);
        assert expected == actual;
    }
}
