package leetcode;

import org.junit.jupiter.api.Test;

public class P2287Test {

    @Test
    void test1() {
        String s = "aaaaaabbbcccdddddddd";
        String target = "aabcd";
        int exptected = 3;
        P2287 solution = new P2287();
        int actual = solution.rearrangeCharacters(s, target);
        assert exptected == actual;
    }
}
