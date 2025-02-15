package leetcode;

import org.junit.jupiter.api.Test;

public class P2114Test {

    @Test
    void test1() {
        String[] sentences = new String[] {"abc def ghi", "ab cd ef gh i", "a b c d e f g h i"};
        int expected = 9;
        P2114 solution = new P2114();
        int actual = solution.mostWordsFound(sentences);
        assert expected == actual;
    }
}
