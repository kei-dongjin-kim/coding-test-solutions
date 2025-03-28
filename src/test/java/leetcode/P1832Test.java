package leetcode;

import org.junit.jupiter.api.Test;

public class P1832Test {

    @Test
    void test1() {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        boolean expected = true;
        P1832 solution = new P1832();
        boolean actual = solution.checkIfPangram(sentence);
        assert expected == actual;
    }
}
