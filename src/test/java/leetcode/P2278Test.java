package leetcode;

import org.junit.jupiter.api.Test;

public class P2278Test {

    @Test
    void test1() {
        String s = "abbacabbac";
        char letter = 'a';
        int expected = 40;
        P2278 solution = new P2278();
        int actual = solution.percentageLetter(s, letter);
        assert expected == actual;
    }
}
