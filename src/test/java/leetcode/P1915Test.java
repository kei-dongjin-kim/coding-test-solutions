package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1915Test {

    @Test
    @DisplayName("word = aba")
    void test1() {
        String word = "aba";
        long expected = 4;
        long actual = new P1915().wonderfulSubstrings(word);
        assert actual == expected;
    }
}
