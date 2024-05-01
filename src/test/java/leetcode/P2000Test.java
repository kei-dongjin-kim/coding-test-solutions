package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2000Test {

    @Test
    @DisplayName("word = abcdefd, ch = 'd'")
    void test1() {
        String word = "abcdefd";
        char ch = 'd';
        String expected = "dcbaefd";
        String actual = new P2000().reversePrefix(word, ch);
        assert expected.equals(actual);
    }
}
