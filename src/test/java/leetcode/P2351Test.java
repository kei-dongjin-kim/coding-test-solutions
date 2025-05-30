package leetcode;

import org.junit.jupiter.api.Test;

public class P2351Test {

    @Test
    void test1() {
        String s = "abcddefg";
        char expected = 'd';
        P2351 solution = new P2351();
        char actual = solution.repeatedCharacter(s);
        assert expected == actual;
    }
}
