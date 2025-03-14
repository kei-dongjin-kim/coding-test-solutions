package leetcode;

import org.junit.jupiter.api.Test;

public class P1662Test {

    @Test
    void test1() {
        String[] word1 = new String[] {"soli", "tude"};
        String[] word2 = new String[] {"sol", "itude"};
        boolean expected = true;
        P1662 solution = new P1662();
        boolean actual = solution.arrayStringsAreEqual(word1, word2);
        assert expected == actual;
    }
}
