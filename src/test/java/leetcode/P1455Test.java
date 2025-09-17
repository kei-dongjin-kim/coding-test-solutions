package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1455Test {

    @Test
    void test1() {
        String sentence = "The world is great, isn't it?";
        String searchWord = "gre";
        int expected = 4;
        P1455 solution = new P1455();
        int actual = solution.isPrefixOfWord(sentence, searchWord);
        Assertions.assertEquals(expected, actual);
    }
}
